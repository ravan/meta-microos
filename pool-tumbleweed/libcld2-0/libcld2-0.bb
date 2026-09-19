SUMMARY = "A library to detect the natural language of text"
DESCRIPTION = "A library that detects over 80 languages in UTF-8 text, based largely \
on groups of four letters. Also tables for 160+ language versions."
LICENSE = "Apache-2.0"

PV = "20150820"

RPM_NAME = "libcld2-0-20150820-6.9.aarch64.rpm"
RPM_HASH = "be2da963d24a58ee0b25935c0f17f27039fa1a25fe442eb517b0e3ea94ebcb302002c63d70dbc1895de4f9672e4d01484133c9c4bc2f6c4575cd81d45365d674"

RPROVIDES:${PN} += "libcld2-0 \
libcld2-dynamic.so.0 \
libcld2-full.so.0 \
libcld2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
