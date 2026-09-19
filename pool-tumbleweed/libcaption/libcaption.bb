SUMMARY = "CEA608 / CEA708 closed-caption encoder/decoder"
DESCRIPTION = "libcaption is a library written in C to aid in the creating and parsing of \
closed caption data, open sourced under the MIT license to use within community \
developed broadcast tools."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "libcaption-0.8-1.6.aarch64.rpm"
RPM_HASH = "71f4afd7f10d827bb9cde4a7e03bdac7e8474cf812f2951abec961781b5e641603de9c1e0017159fae4f35fd80ffd761442655ca9b50b5594cff6c74cd41ab7e"

RPROVIDES:${PN} += "libcaption \
libcaption.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
