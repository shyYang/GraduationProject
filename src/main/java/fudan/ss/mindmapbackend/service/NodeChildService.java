package fudan.ss.mindmapbackend.service;

import fudan.ss.mindmapbackend.model.*;
import fudan.ss.mindmapbackend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeChildService {
    @Autowired
    private CoursewareRepository coursewareRepository;
    @Autowired
    private LinkRepository linkRepository;
    @Autowired
    private MaterialRepository materialRepository;
    @Autowired
    private AssignmentMultipleRepository assignmentMultipleRepository;
    @Autowired
    private AssignmentShortRepository assignmentShortRepository;
    @Autowired
    private StudentAnswerRepository studentAnswerRepository;
    @Autowired
    private AssignmentJudgmentRepository assignmentJudgmentRepository;

    public void deleteCoursewareFather(String coursewareName) {
        coursewareRepository.deleteFather(coursewareName);
    }

    public void createCoursewareFather(String coursewareName, String course_mindmap, String nodeId) {
        coursewareRepository.createFather(coursewareName, course_mindmap, nodeId);
    }

    public void deleteLinkFather(String linkAddress) {
        linkRepository.deleteFather(linkAddress);
    }

    public void createLinkFather(String linkAddress, String course_mindmap, String nodeId) {
        linkRepository.createFather(linkAddress, course_mindmap, nodeId);
    }

    public void deleteMaterialFather(String materialName) {
        materialRepository.deleteFather(materialName);
    }

    public void createMaterialFather(String materialName, String course_mindmap, String nodeId) {
        materialRepository.createFather(materialName, course_mindmap, nodeId);
    }

    public void deleteAssignmentMultiFather(long id) {
        assignmentMultipleRepository.deleteFather(id);
    }

    public void deleteAssignmentJudgeFather(long id) {
        assignmentJudgmentRepository.deleteFather(id);
    }

    public void createAssignmentMultiFather(long id, String course_mindmap, String nodeId) {
        assignmentMultipleRepository.createFather(id, course_mindmap, nodeId);
    }

    public void createAssignmentJudgeFather(long id, String course_mindmap, String nodeId) {
        assignmentJudgmentRepository.createFather(id, course_mindmap, nodeId);
    }

    public void deleteAssignmentShortFather(long id) {
        assignmentShortRepository.deleteFather(id);
    }

    public void createAssignmentShortFather(long id, String course_mindmap, String nodeId) {
        assignmentShortRepository.createFather(id, course_mindmap, nodeId);
    }

    public List<AssignmentShort> findShorts(String shortId) {
        return assignmentShortRepository.findByShortId(shortId);
    }

    public List<AssignmentMultiple> findMultis(String multiId) {
        return assignmentMultipleRepository.findByMultiId(multiId);
    }

    public void saveMulti(AssignmentMultiple assignmentMultiple) {
        assignmentMultipleRepository.save(assignmentMultiple);
    }

    public List<AssignmentJudgment> findJudgements(String judgeId) {
        return assignmentJudgmentRepository.findByJudge_id(judgeId);
    }

    public void saveJudge(AssignmentJudgment assignmentJudgment) {
        assignmentJudgmentRepository.save(assignmentJudgment);
    }

    public StudentAnswer getStudentAns(String studentName, String assignmentId) {
        return studentAnswerRepository.findByStudentNameAndAndAssignmentId(studentName, assignmentId);
    }

    public StudentAnswer addStudentAnswer(StudentAnswer studentAnswer) {
        return studentAnswerRepository.save(studentAnswer);
    }

    public void saveShort(AssignmentShort assignmentShort) {
        assignmentShortRepository.save(assignmentShort);
    }

    public void saveCourseware(Courseware courseware) {
        coursewareRepository.save(courseware);
    }

    public void saveMaterial(Material material) {
        materialRepository.save(material);
    }

    public void saveLink(Link link) {
        linkRepository.save(link);
    }

    public Courseware findCourseware(String storeAddress) {
        return coursewareRepository.findByStoreAddress(storeAddress);
    }

    public Material findMaterial(String storeAddress) {
        return materialRepository.findByStoreAddress(storeAddress);
    }
}
