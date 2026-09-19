SUMMARY = "API documentation for osgi-service-log"
DESCRIPTION = "This package provides API documentation for osgi-service-log."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "osgi-service-log-javadoc-1.5.0-2.10.noarch.rpm"
RPM_HASH = "71340a019b33288170202863e0a866a5f1e8f411c11088bf466236f9c8164ca5f3da01db70acc7753d275661f121eaa72efa487e1640048a6e60176b7e5594dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-log-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
