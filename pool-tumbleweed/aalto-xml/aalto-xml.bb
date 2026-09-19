SUMMARY = "Ultra-high performance non-blocking XML processor (Stax API + extensions)"
DESCRIPTION = "Aalto XML processor is an ultra-high performance next generation Stax XML \
processor implementation, implementing both basic Stax API (javax.xml.stream) \
and Stax2 API extension (org.codehaus.woodstox.stax2). In addition, it also \
implements SAX2 API. \
 \
In additional to standard Java XML interfaces, one unique feature not \
implemented by any other Java XML parser that we are aware is so-called \
non-blocking (asynchronous) XML parsing: ability to parse XML without using \
blocking I/O, necessary for fully asynchronous processing such as those with \
Akka framework. Aalto non-blocking API is a minimalistic extension above \
Stax/Stax2 API to allow indication of 'not yet available' token \
(EVENT_INCOMPLETE) as well as feeding of input (since InputStream can not be \
used as it blocks)."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "aalto-xml-1.4.0-1.2.noarch.rpm"
RPM_HASH = "4f122d1dcaca8bc9d1ba048a08e2759a197b99ea53038d0f601b80ac880666e54babc5827adcce53ddc373ee4e0cf5ff1aac298bf9ae40a8af1c77cab1122d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aalto-xml \
mvn-com.fasterxml-aalto-xml \
mvn-com.fasterxml-aalto-xml-pom- \
osgi-com.fasterxml.aalto-xml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
