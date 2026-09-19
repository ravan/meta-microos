SUMMARY = "Javadoc for resteasy"
DESCRIPTION = "This package contains the API documentation for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-javadoc-3.0.26-4.17.noarch.rpm"
RPM_HASH = "8ebd69d1bc31138f70efa96234630e74119898daf641749a0f1ecbbff9ec87a785743114c68a30d7efdaa07c0102fd8ea7943970c9215f822c3723798603c939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "resteasy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
