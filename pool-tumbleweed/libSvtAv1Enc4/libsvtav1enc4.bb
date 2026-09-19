SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.2.0"

RPM_NAME = "libSvtAv1Enc4-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "7adc820b725cc7b756aab01849de6f6ba8f2f3e541737d3fa26c3b46f5c746b6bfa2650b050e491da7095fcbf740d2841fca315af6876f95b7b73b836d6fddda"

RPROVIDES:${PN} += "libSvtAv1Enc.so.4 \
libSvtAv1Enc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
