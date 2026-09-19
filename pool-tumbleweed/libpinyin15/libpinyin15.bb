SUMMARY = "Intelligent Pinyin IME"
DESCRIPTION = "libpinyin is a staging joint effort of many Chinese Pinyin IME development \
teams. It is an intelligent (and universal) sentence-based Pinyin IME backend \
supporting many language models and frontends. \
 \
This package provides runtime library for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "libpinyin15-2.10.3-1.7.aarch64.rpm"
RPM_HASH = "43d025c019c1ddcc32ab6f7d717e74a04e42e2cd1716724840ba036d43168d09a498e320acb1d00833eddc8313c7cbeb2774092e2a2168aa8c31fc4bfd7ad8a3"

RPROVIDES:${PN} += "libpinyin.so.15 \
libpinyin15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libkyotocabinet.so.16 \
libm.so.6 \
libpinyin-data \
libstdc++.so.6"

inherit rpm
