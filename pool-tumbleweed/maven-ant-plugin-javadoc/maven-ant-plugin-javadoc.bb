SUMMARY = "Javadoc for maven-ant-plugin"
DESCRIPTION = "API documentation for maven-ant-plugin."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "maven-ant-plugin-javadoc-2.4-5.8.noarch.rpm"
RPM_HASH = "642ab31cd12d05f1ec5eec467a7a5742e4637a870f610e8584c520593da5e11195c84fc379f2497a56afc5281da1791c684c5b9dbe6667ce01a5f17442d1ec10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-ant-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
