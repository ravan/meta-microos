SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package contains the encoder and the decoder tools."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "jxrlib-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "23ca30f0d43058e218091260a4127f5aecf4bc407e25a7e81c329bf8354f5252334c9f339fea860387a0633bd291914a4ac3f3502b8fa5ae6eee3c593b845bae"

RPROVIDES:${PN} += "jxrlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjxrglue.so.0"

inherit rpm
