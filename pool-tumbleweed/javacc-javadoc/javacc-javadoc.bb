SUMMARY = "Javadoc for javacc"
DESCRIPTION = "This package contains the API documentation for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.13"

RPM_NAME = "javacc-javadoc-7.0.13-2.11.noarch.rpm"
RPM_HASH = "3857d3bce7647dca9ca813ef86dfd28609c934e2c93e7ef21d3adc4e4d4bd60e065526e3154fe41021467b4a326f876ebdda8610f71ffbabaa23f7427f5921cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
