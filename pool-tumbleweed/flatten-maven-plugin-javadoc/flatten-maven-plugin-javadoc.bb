SUMMARY = "API documentation for flatten-maven-plugin"
DESCRIPTION = "This package provides API documentation for flatten-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "flatten-maven-plugin-javadoc-1.7.1-1.4.noarch.rpm"
RPM_HASH = "fa22956470aa67bfd2ead62d116bdb532946f745e9ee2607bccfbaba1ebe05f0ca9a719a244c7f8b0d40626bc9e6f6bfdc7612586ce2dbd5c029df41ba8e5813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatten-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
