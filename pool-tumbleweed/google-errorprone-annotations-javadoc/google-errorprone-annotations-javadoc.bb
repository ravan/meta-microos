SUMMARY = "Javadoc for google-errorprone-annotations"
DESCRIPTION = "This package contains the API documentation for google-errorprone-annotations."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-annotations-javadoc-2.26.1-2.9.noarch.rpm"
RPM_HASH = "e4fa06b458755083e2ab1005ffaa21cd8cf7a5e85883e342cc6a3ee54048f09135654ac284dd042ad211e685fc74c8abfa6edad84c45ed87726fc7560d17e10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
