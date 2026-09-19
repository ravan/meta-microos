SUMMARY = "API documentation for httpcomponents-client"
DESCRIPTION = "API documentation for httpcomponents-client."
LICENSE = "Apache-2.0"

PV = "4.5.14"

RPM_NAME = "httpcomponents-client-javadoc-4.5.14-2.1.noarch.rpm"
RPM_HASH = "54cdbc9dbb769980c109e96995e998f8f4a9571d79063d702eb0aa935815e495f43f8a6b157b2773da55cb8866e208af09d70f3ebe5d8c7eb4611ff13b8939f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
