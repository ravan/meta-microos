SUMMARY = "A fork from googlepinyin on android"
DESCRIPTION = "libgooglepinyin is an input method fork from google pinyin on android"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "libgooglepinyin0-0.1.2-14.5.aarch64.rpm"
RPM_HASH = "33763b0b76690f15640cc2c2c635e6801d3893bd8ddb175bf485c335c823fe66f4b5961697f4d3a0df6173f2a068ce3b6ab7c7d80de6c383acfb8513e165a085"

RPROVIDES:${PN} += "libgooglepinyin.so.0 \
libgooglepinyin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
