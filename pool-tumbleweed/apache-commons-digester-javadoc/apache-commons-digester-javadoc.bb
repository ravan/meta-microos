SUMMARY = "Javadoc for apache-commons-digester"
DESCRIPTION = "The goal of the Jakarta Commons Digester project is to create and \
maintain a XML -> Java object mapping package written in the Java \
language to be distributed under the ASF license. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Digester Package."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "apache-commons-digester-javadoc-2.1-5.8.noarch.rpm"
RPM_HASH = "23a864b5070f32b0ecf7f90a01759c4c072d5b785de5df98d319406bbd247b603389351e800f1ea3fcfb6fbfe2a731b0e86f264f91b483dbdef60ca39b0c4c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
