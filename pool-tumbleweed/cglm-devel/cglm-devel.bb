SUMMARY = "Header files for C OpenGL Mathematics"
DESCRIPTION = "This package contains development files for cglm."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "cglm-devel-0.9.6-1.4.aarch64.rpm"
RPM_HASH = "96a6c39d98a2f9d9cc634bcbf82586b974b7274cbac649ed15ce523a3c589140560e0202c98e6dc4990138535c49ed503b93036918d839edc07114a4aa2efdf8"

RPROVIDES:${PN} += "cglm-devel \
pkgconfig-cglm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcglm0"

inherit rpm
