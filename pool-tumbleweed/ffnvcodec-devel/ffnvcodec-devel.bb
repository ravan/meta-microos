SUMMARY = "FFmpeg version of NVIDIA codec API headers"
DESCRIPTION = "This package contains the headers required for FFmpeg to interface \
with NVIDIA codec APIs."
LICENSE = "MIT"

PV = "13.0.19.0"

RPM_NAME = "ffnvcodec-devel-13.0.19.0-1.4.aarch64.rpm"
RPM_HASH = "226c057091a8813a07fd1482256c87e54c0ff758735ec4310a24ddbef7e117fac6fa8c1d3ff3b7f1102c26108ace8405a37fd5d29f181e4f94ad75cc71423afb"

RPROVIDES:${PN} += "ffnvcodec-devel \
pkgconfig-ffnvcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
