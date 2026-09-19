SUMMARY = "INIH dynamic libary files"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the library for use at runtime by applications using INIH."
LICENSE = "BSD-3-Clause"

PV = "62"

RPM_NAME = "libinih0-62-1.5.aarch64.rpm"
RPM_HASH = "ac5e9a0a87cf9982388932d19ca5172d015b50fed3430d63a115f93aeff5afcf04f8056503dde1d52a2adc0ee0482099d34d2e3506021fefb39fd4101a47167d"

RPROVIDES:${PN} += "libINIReader.so.0 \
libinih.so.0 \
libinih0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
