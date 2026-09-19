SUMMARY = "Tool to convert ASCII/Latin Text into PostScript"
DESCRIPTION = "a2ps converts ASCII text into PostScript. This feature is used by \
apsfilter, for example, to pretty-print ASCII text. \
 \
Warning: a2ps is not able to convert complex Unicode (UTF-8) text to \
PostScript.  Only language text which can be converted from UTF-8 to \
Latin encodings are supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.8"

RPM_NAME = "a2ps-4.15.8-1.1.aarch64.rpm"
RPM_HASH = "cc4629e6cf6acdc5c5f2f6373d6bc42ba012df22627d92fef60bb5f48894849231d76c96c0b2c8017547af9f1acea9492a89b587c7db9a1aa234985eb721c2db"

RPROVIDES:${PN} += "a2ps \
a2ps-bin \
config-a2ps"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
file \
ghostscript-fonts-std \
glibc \
glibc-locale \
ld-linux-aarch64.so.1 \
liba2ps.so.1 \
libc.so.6 \
libgc.so.1 \
libm.so.6 \
libpaper.so.2 \
sed \
w3m \
wdiff"

inherit rpm
