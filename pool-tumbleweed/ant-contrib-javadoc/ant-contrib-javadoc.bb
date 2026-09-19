SUMMARY = "Javadoc for ant-contrib"
DESCRIPTION = "Api documentation for ant-contrib."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-javadoc-1.0b3-12.10.noarch.rpm"
RPM_HASH = "cd076baf8cde111a5c917c501a61832ca47ba22357f76ba5bed035a7601531b375fed19a552af0a280dfe3587d3fc41f02eded467dcb701be243c543388ce143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jpackage-utils"

inherit rpm
