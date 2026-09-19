SUMMARY = "API documentation for Guice"
DESCRIPTION = "This package provides API documentation for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "google-guice-javadoc-6.0.0-3.6.noarch.rpm"
RPM_HASH = "811fe65ac92fce1ad94038b60e92f206bb4c3cbd13baf4ebf4634d09412034adc8cfaca29af056f948b2b0e6160d0270dc0e9fdb747de1f059a0e9d6bb2eab19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guice-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
