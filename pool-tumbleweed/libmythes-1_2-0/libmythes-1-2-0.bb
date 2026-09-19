SUMMARY = "A simple thesaurus for Libreoffice"
DESCRIPTION = "MyThes is a simple thesaurus that uses a structured text data file and an \
index file with binary search to look up words and phrases and return \
information on part of speech, meanings, and synonyms."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "libmythes-1_2-0-1.2.5-1.12.aarch64.rpm"
RPM_HASH = "3dacf605c516c714d9919a1ac4b6fc62df441069d142af78dd4804f55eab62a18a8bbd798c7b16a3a811053b84c8ba7d3590b4ebea63e96a2c80cc2ca5afca83"

RPROVIDES:${PN} += "libmythes-1-2-0 \
libmythes-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
