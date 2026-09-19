SUMMARY = "RELAX NG validator in Java"
DESCRIPTION = "jing is an XML validator implemented in Java. It validates against the \
RELAX NG schema language and implements the following specifications: \
 \
* RELAX NG 1.0 Specification \
* RELAX NG Compact Syntax \
* Parts of RELAX NG DTD Compatibility (checking of ID/IDREF/IDREFS) \
 \
It also comes with experimental support for schema languages other than \
RELAX NG: \
 \
* W3C XML Schema (based on Xerces-J) \
* Schematron 1.5 \
* Namespace Routing Language"
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-20220510-5.10.noarch.rpm"
RPM_HASH = "ba57a3493c41e3f5d788a936681504ba50b676cccf50e32d7e6136227cbbfa416db97e6d999d71de0323c35635f2437896c88744e768b107edbe827a17ebb9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing \
mvn-com.thaiopensource-jing \
mvn-org.relaxng-jing \
mvn-org.relaxng-jing-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils \
mvn-com.github.relaxng-relaxngDatatype \
mvn-isorelax-isorelax \
mvn-net.sf.saxon-Saxon-HE \
mvn-xerces-xercesImpl \
mvn-xml-apis-xml-apis \
mvn-xml-resolver-xml-resolver"

inherit rpm
