SUMMARY = "Source Code Highlighter with Support for Many Languages"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual)."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "source-highlight-3.1.9-5.22.aarch64.rpm"
RPM_HASH = "54b3bbce99621d52adf905ea1e0dc2cf067cd2199c358b7ceeb8f22322d52760dca95f51f7e8ae694bf837c5162067144639a3deba00cfa6f3c27f8ce60ee277"

RPROVIDES:${PN} += "config-source-highlight \
source-highlight"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsource-highlight.so.4 \
libstdc++.so.6"

inherit rpm
