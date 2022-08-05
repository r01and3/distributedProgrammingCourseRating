
package webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddWork_QNAME = new QName("http://server/", "addWork");
    private final static QName _AddWorkResponse_QNAME = new QName("http://server/", "addWorkResponse");
    private final static QName _GetAllMarks_QNAME = new QName("http://server/", "getAllMarks");
    private final static QName _GetAllMarksResponse_QNAME = new QName("http://server/", "getAllMarksResponse");
    private final static QName _GetAverageMark_QNAME = new QName("http://server/", "getAverageMark");
    private final static QName _GetAverageMarkResponse_QNAME = new QName("http://server/", "getAverageMarkResponse");
    private final static QName _GetIdsRandomWorks_QNAME = new QName("http://server/", "getIdsRandomWorks");
    private final static QName _GetIdsRandomWorksResponse_QNAME = new QName("http://server/", "getIdsRandomWorksResponse");
    private final static QName _GetWork_QNAME = new QName("http://server/", "getWork");
    private final static QName _GetWorkResponse_QNAME = new QName("http://server/", "getWorkResponse");
    private final static QName _GetWorks_QNAME = new QName("http://server/", "getWorks");
    private final static QName _GetWorksResponse_QNAME = new QName("http://server/", "getWorksResponse");
    private final static QName _SetMark_QNAME = new QName("http://server/", "setMark");
    private final static QName _SetMarkResponse_QNAME = new QName("http://server/", "setMarkResponse");
    private final static QName _GetWorkResponseReturn_QNAME = new QName("", "return");
    private final static QName _AddWorkArg1_QNAME = new QName("", "arg1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddWork }
     * 
     */
    public AddWork createAddWork() {
        return new AddWork();
    }

    /**
     * Create an instance of {@link AddWorkResponse }
     * 
     */
    public AddWorkResponse createAddWorkResponse() {
        return new AddWorkResponse();
    }

    /**
     * Create an instance of {@link GetAllMarks }
     * 
     */
    public GetAllMarks createGetAllMarks() {
        return new GetAllMarks();
    }

    /**
     * Create an instance of {@link GetAllMarksResponse }
     * 
     */
    public GetAllMarksResponse createGetAllMarksResponse() {
        return new GetAllMarksResponse();
    }

    /**
     * Create an instance of {@link GetAverageMark }
     * 
     */
    public GetAverageMark createGetAverageMark() {
        return new GetAverageMark();
    }

    /**
     * Create an instance of {@link GetAverageMarkResponse }
     * 
     */
    public GetAverageMarkResponse createGetAverageMarkResponse() {
        return new GetAverageMarkResponse();
    }

    /**
     * Create an instance of {@link GetIdsRandomWorks }
     * 
     */
    public GetIdsRandomWorks createGetIdsRandomWorks() {
        return new GetIdsRandomWorks();
    }

    /**
     * Create an instance of {@link GetIdsRandomWorksResponse }
     * 
     */
    public GetIdsRandomWorksResponse createGetIdsRandomWorksResponse() {
        return new GetIdsRandomWorksResponse();
    }

    /**
     * Create an instance of {@link GetWork }
     * 
     */
    public GetWork createGetWork() {
        return new GetWork();
    }

    /**
     * Create an instance of {@link GetWorkResponse }
     * 
     */
    public GetWorkResponse createGetWorkResponse() {
        return new GetWorkResponse();
    }

    /**
     * Create an instance of {@link GetWorks }
     * 
     */
    public GetWorks createGetWorks() {
        return new GetWorks();
    }

    /**
     * Create an instance of {@link GetWorksResponse }
     * 
     */
    public GetWorksResponse createGetWorksResponse() {
        return new GetWorksResponse();
    }

    /**
     * Create an instance of {@link SetMark }
     * 
     */
    public SetMark createSetMark() {
        return new SetMark();
    }

    /**
     * Create an instance of {@link SetMarkResponse }
     * 
     */
    public SetMarkResponse createSetMarkResponse() {
        return new SetMarkResponse();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link Mark }
     * 
     */
    public Mark createMark() {
        return new Mark();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWork }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddWork }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "addWork")
    public JAXBElement<AddWork> createAddWork(AddWork value) {
        return new JAXBElement<AddWork>(_AddWork_QNAME, AddWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddWorkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "addWorkResponse")
    public JAXBElement<AddWorkResponse> createAddWorkResponse(AddWorkResponse value) {
        return new JAXBElement<AddWorkResponse>(_AddWorkResponse_QNAME, AddWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMarks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMarks }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllMarks")
    public JAXBElement<GetAllMarks> createGetAllMarks(GetAllMarks value) {
        return new JAXBElement<GetAllMarks>(_GetAllMarks_QNAME, GetAllMarks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMarksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMarksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllMarksResponse")
    public JAXBElement<GetAllMarksResponse> createGetAllMarksResponse(GetAllMarksResponse value) {
        return new JAXBElement<GetAllMarksResponse>(_GetAllMarksResponse_QNAME, GetAllMarksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAverageMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAverageMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAverageMark")
    public JAXBElement<GetAverageMark> createGetAverageMark(GetAverageMark value) {
        return new JAXBElement<GetAverageMark>(_GetAverageMark_QNAME, GetAverageMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAverageMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAverageMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAverageMarkResponse")
    public JAXBElement<GetAverageMarkResponse> createGetAverageMarkResponse(GetAverageMarkResponse value) {
        return new JAXBElement<GetAverageMarkResponse>(_GetAverageMarkResponse_QNAME, GetAverageMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdsRandomWorks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdsRandomWorks }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getIdsRandomWorks")
    public JAXBElement<GetIdsRandomWorks> createGetIdsRandomWorks(GetIdsRandomWorks value) {
        return new JAXBElement<GetIdsRandomWorks>(_GetIdsRandomWorks_QNAME, GetIdsRandomWorks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdsRandomWorksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdsRandomWorksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getIdsRandomWorksResponse")
    public JAXBElement<GetIdsRandomWorksResponse> createGetIdsRandomWorksResponse(GetIdsRandomWorksResponse value) {
        return new JAXBElement<GetIdsRandomWorksResponse>(_GetIdsRandomWorksResponse_QNAME, GetIdsRandomWorksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWork }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWork }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getWork")
    public JAXBElement<GetWork> createGetWork(GetWork value) {
        return new JAXBElement<GetWork>(_GetWork_QNAME, GetWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getWorkResponse")
    public JAXBElement<GetWorkResponse> createGetWorkResponse(GetWorkResponse value) {
        return new JAXBElement<GetWorkResponse>(_GetWorkResponse_QNAME, GetWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorks }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getWorks")
    public JAXBElement<GetWorks> createGetWorks(GetWorks value) {
        return new JAXBElement<GetWorks>(_GetWorks_QNAME, GetWorks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "getWorksResponse")
    public JAXBElement<GetWorksResponse> createGetWorksResponse(GetWorksResponse value) {
        return new JAXBElement<GetWorksResponse>(_GetWorksResponse_QNAME, GetWorksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "setMark")
    public JAXBElement<SetMark> createSetMark(SetMark value) {
        return new JAXBElement<SetMark>(_SetMark_QNAME, SetMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "setMarkResponse")
    public JAXBElement<SetMarkResponse> createSetMarkResponse(SetMarkResponse value) {
        return new JAXBElement<SetMarkResponse>(_SetMarkResponse_QNAME, SetMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetWorkResponse.class)
    public JAXBElement<byte[]> createGetWorkResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetWorkResponseReturn_QNAME, byte[].class, GetWorkResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = AddWork.class)
    public JAXBElement<byte[]> createAddWorkArg1(byte[] value) {
        return new JAXBElement<byte[]>(_AddWorkArg1_QNAME, byte[].class, AddWork.class, ((byte[]) value));
    }

}
