SUMMARY = "API documentation for args4j"
DESCRIPTION = "This package contains the API documentation for args4j."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-javadoc-2.33-3.9.noarch.rpm"
RPM_HASH = "c9d58ae2eff170dd86897986b237c59a980c911e118cb34093d596dbb00124de4c7b940fc0ca1d844ace49ec13c08e182bf1b4eb2e9cfbf9e37d4d8080e92a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
