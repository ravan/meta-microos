SUMMARY = "Library for parsing XML DTDs"
DESCRIPTION = "Library for parsing XML DTDs."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.4"

RPM_NAME = "glassfish-dtd-parser-1.4-7.7.noarch.rpm"
RPM_HASH = "e8ef75aafcf4ab28771e652a1a3effefb3756ea27e5354fb603460b8128cf75d251c27575759fa59968044553f26620eee44cc9df1ef2aacdc2522c3a311d6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-dtd-parser \
mvn-com.sun.xml.dtd-parser-dtd-parser \
mvn-com.sun.xml.dtd-parser-dtd-parser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
