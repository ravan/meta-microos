SUMMARY = "API documentation for jetty-build-support"
DESCRIPTION = "API documentation for jetty-build-support."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.5"

RPM_NAME = "jetty-build-support-javadoc-1.5-5.4.noarch.rpm"
RPM_HASH = "163e9619d620720b8649b5c71007b392828c4302ab617069411ad4d795d1a17235ea6003544b43e7721f5c663bf77a53e7b3b9220e3346d259e96898d482de43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-build-support-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
