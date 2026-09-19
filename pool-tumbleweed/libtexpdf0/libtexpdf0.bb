SUMMARY = "A PDF library extracted from TeX's dvipdfmx"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the shared library for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.13"

RPM_NAME = "libtexpdf0-0.15.13-2.7.aarch64.rpm"
RPM_HASH = "6706623d975f7a12a5bb7d2017b014829aa09df625732f7bc39b0efcbf183f69fca78c36169ba124bc4e9067e7f6fb47ddd3dd60904505dd3a3e6d970c0f31fa"

RPROVIDES:${PN} += "libtexpdf.so.0 \
libtexpdf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
