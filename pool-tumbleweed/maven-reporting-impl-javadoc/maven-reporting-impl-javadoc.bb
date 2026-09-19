SUMMARY = "Javadoc for maven-reporting-impl"
DESCRIPTION = "API documentation for maven-reporting-impl."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "maven-reporting-impl-javadoc-4.0.0-1.7.noarch.rpm"
RPM_HASH = "90927288b2e2fef029780a9ac23f8cbc4d31291cd036526091cd5f5d3008b2704f1578edcca389b239a9185a3adcdbbbaa63a3eb4ce87347b272202db628ad47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
