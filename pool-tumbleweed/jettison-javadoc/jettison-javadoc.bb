SUMMARY = "Javadocs for jettison"
DESCRIPTION = "This package contains the API documentation for jettison."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-javadoc-1.5.4-2.10.noarch.rpm"
RPM_HASH = "4ff62eada89471f0aed16a7bc114a1c6bbcf2e4cd4be5da6841927c81aca5b17deff726b22dd57e16e2e8f0f887f651b9396a06d8a95c0a27c9477f44d064d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
