SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-dri-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "dad4465e2123800a8e1716253d4577e1a6ac4b653f196b30ad2b579242a25d793b3f5cf0018f0366481861cdba46a7759d897f58a5989daa41931c56eb2dd889"

RPROVIDES:${PN} += "Mesa-dri-devel \
pkgconfig-dri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa \
pkgconfig-libdrm"

inherit rpm
