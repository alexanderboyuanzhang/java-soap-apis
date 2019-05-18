
package com.mkyong.ws.jaxws;

import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getIpAddressResponse", namespace = "http://ws.mkyong.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIpAddressResponse", namespace = "http://ws.mkyong.com/")
public class GetIpAddressResponse {
    @XmlElement(name = "return1", namespace = "")
    private String _return1;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return1;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return1 = _return;
    }

}
