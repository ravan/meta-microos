SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.2.0"

RPM_NAME = "SVT-AV1-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "c0de88ba941c1f706b30a1d90ab0836476bf7eb2e709af8470c31656f4cb9fe46e4bb4c4b22a6c5bd9902bf36653d94cdcc96b451cb379e0ec09e63748785550"

RPROVIDES:${PN} += "SVT-AV1 \
bundled-fastfeat \
bundled-safestringlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSvtAv1Enc.so.4 \
libc.so.6 \
libm.so.6"

inherit rpm
