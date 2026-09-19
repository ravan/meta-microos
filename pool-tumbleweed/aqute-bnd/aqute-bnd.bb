SUMMARY = "BND Tool"
DESCRIPTION = "The bnd tool helps you create and diagnose OSGi bundles. \
The key functions are: \
- Show the manifest and JAR contents of a bundle \
- Wrap a JAR so that it becomes a bundle \
- Create a Bundle from a specification and a class path \
- Verify the validity of the manifest entries \
The tool is capable of acting as: \
- Command line tool \
- File format \
- Directives \
- Use of macros"
LICENSE = "Apache-2.0"

PV = "6.4.1"

RPM_NAME = "aqute-bnd-6.4.1-7.1.noarch.rpm"
RPM_HASH = "7d14e323c11acf37a0c30b26d6d1577cb5982509c3fa85db76d99663c762cea75a1d8b2636103cbea302ffc09bd3254917e79ebc1ef3e90cbab54a108e1b1a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bnd \
config-aqute-bnd \
mvn-biz.aQute-bnd \
mvn-biz.aQute-bnd-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd \
mvn-biz.aQute.bnd-biz.aQute.bnd-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.ant \
mvn-biz.aQute.bnd-biz.aQute.bnd.ant-pom- \
mvn-biz.aQute.bnd-bnd \
mvn-biz.aQute.bnd-bnd-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
aqute-bndlib \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-biz.aQute.bnd-biz.aQute.bnd.exporters \
mvn-biz.aQute.bnd-biz.aQute.bnd.util \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-org.apache.ant-ant \
mvn-org.osgi-osgi.annotation \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
