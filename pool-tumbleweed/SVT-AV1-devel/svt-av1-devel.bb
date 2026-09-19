SUMMARY = "Development files for SVT-AV1"
DESCRIPTION = "An AV1 encoder for video streams from Intel. \
 \
This package contains the header files for svt-av1."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.2.0"

RPM_NAME = "SVT-AV1-devel-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "0239dc6932c579d2b87cacc353bc4f0be7b289716e00cae1891beaf9b3f5585732ea053ef4282e77f16f0e5d2cd585236f69d372412e502e7e726e6bc2eeb335"

RPROVIDES:${PN} += "SVT-AV1-devel \
cmake-SVT-AV1 \
pkgconfig-SvtAv1Enc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSvtAv1Enc4"

inherit rpm
