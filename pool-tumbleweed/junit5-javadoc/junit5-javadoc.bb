SUMMARY = "Javadoc for junit5"
DESCRIPTION = "Junit5 API documentation."
LICENSE = "EPL-2.0"

PV = "5.14.4"

RPM_NAME = "junit5-javadoc-5.14.4-2.2.noarch.rpm"
RPM_HASH = "4efd2b65dac5838cf1b15e6e48e71af52d394506d884ae8e926d7c7200ba86fa773c7ff2e521b2de8de9fab81907c8d47d3cd30ca073f6e7f9130770efecd7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
