SUMMARY = "Javadoc for swingx"
DESCRIPTION = "This package contains the API documentation for swingx."
LICENSE = "LGPL-2.0-only"

PV = "1.6.5.1"

RPM_NAME = "swingx-javadoc-1.6.5.1-4.4.noarch.rpm"
RPM_HASH = "212186e8cc96ad65faa5883e038f3c29d590aa4eca37d5663d9aed322caafe7ae510dc3f5962fe708d270759f722fc55e6df2ed829c8550e94f0945d8c477233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swingx-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
