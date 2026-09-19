SUMMARY = "Javadoc for maven-plugin-report-plugin"
DESCRIPTION = "API documentation for maven-plugin-report-plugin."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-report-plugin-javadoc-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "2ac54898c1ebf22162c2a686d7b374e844ecde544b8e198895c2d033f783db9fc96b86f2feb6eb05bdee19add4ffc9bdcbbdf4de67c1dda2773bd4b6fde7472c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-report-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
