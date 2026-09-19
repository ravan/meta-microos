SUMMARY = "Tools for libpinyin"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides the tools used to make data files."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "libpinyin-tools-2.10.3-1.7.aarch64.rpm"
RPM_HASH = "cd8fc16ee79c6e3afb7c1f70502eb58d8fc8dd578afb5daf8df751bc46dd29f890832bf60da6667da57a61d48a0830e6b92f4f51d1fc9dbad296f51db75a9429"

RPROVIDES:${PN} += "libpinyin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libkyotocabinet.so.16 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
