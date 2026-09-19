SUMMARY = "IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving \
International Press \
Telecommunications Council (IPTC) metadata stored within multimedia \
files such as images. This metadata can include captions and keywords, \
often used by popular photo management applications. The library \
provides routines for parsing, viewing, modifying, and saving this \
metadata. The libiptcdata package also includes a command line utility, \
iptc, for editing IPTC data in JPEG files. The library implements the \
IPTC Information Interchange Model according to its specification."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata0-1.0.5-1.20.aarch64.rpm"
RPM_HASH = "d623b0e751834b17e0c196c5a22cc90e9857097bb54b4eb741b32dfc9934ff833b1e46cd833e3f8c36f280080dd074edafb581b017572d2a648e5c4cd3a317cb"

RPROVIDES:${PN} += "libiptcdata.so.0 \
libiptcdata0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libiptcdata"

inherit rpm
