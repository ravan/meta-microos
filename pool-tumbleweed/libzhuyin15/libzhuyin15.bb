SUMMARY = "Intelligent Pinyin IME"
DESCRIPTION = "libpinyin is a staging joint effort of many Chinese Pinyin IME development \
teams. It is an intelligent (and universal) sentence-based Pinyin IME backend \
supporting many language models and frontends. \
 \
This package provides runtime library for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "libzhuyin15-2.10.3-1.7.aarch64.rpm"
RPM_HASH = "99331548e6904cccdd11aee094e8b9e00ac9ae1e582fe2c89fd3941358cfd20ce7f2a4bca30a949b7148b2e3301300c152e1e6538da0017debd7d594195ab307"

RPROVIDES:${PN} += "libzhuyin.so.15 \
libzhuyin15"

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
