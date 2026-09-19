SUMMARY = "API documentation for build-helper-maven-plugin"
DESCRIPTION = "This package provides API documentation for build-helper-maven-plugin."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "build-helper-maven-plugin-javadoc-3.6.0-1.7.noarch.rpm"
RPM_HASH = "c4f58e966d8d3dc94a6bec4edb2d1871a0436412fef62b75fb13c03136368d99aaa3dc1b13dc8bd4fbe36cf87663edc08e415c770b08235774461c9814a31bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-helper-maven-plugin-javadoc \
maven-plugin-build-helper-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
