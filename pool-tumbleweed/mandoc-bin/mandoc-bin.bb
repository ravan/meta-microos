SUMMARY = "Format manual pages"
DESCRIPTION = "The mandoc utility formats manual pages for display. \
 \
It is split out from the mandoc package as it can be useful \
even without replacing the entire man infrastructure."
LICENSE = "ISC"

PV = "1.14.6"

RPM_NAME = "mandoc-bin-1.14.6-7.4.aarch64.rpm"
RPM_HASH = "88a32d6b58a31c42e50c0a95926bde67ed3070e24922a9cbe18e9ffbbc92d8e0c82cff05d2c51b849c481b79f7d170b1e59f1b26f28bd7ac23f32b4d3486523a"

RPROVIDES:${PN} += "mandoc-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
