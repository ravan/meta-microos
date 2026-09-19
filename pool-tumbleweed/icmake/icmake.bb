SUMMARY = "A program maintenance (make) utility using a C-like grammar"
DESCRIPTION = "Icmake allows the programmer to use a program language (closely \
resembling the well-known C-programming language) to define the \
actions involved in (complex) program maintenance. For this, icmake \
offers various special operators as well as a set of support functions \
that have proven to be useful in program maintenance."
LICENSE = "GPL-3.0-only"

PV = "13.06.01"

RPM_NAME = "icmake-13.06.01-1.1.aarch64.rpm"
RPM_HASH = "3cabc04adeb4f553c3cd73c52acda7642b182dbf9ee58905b7c30a9864669130db947a459b80595efa48c048b436a73d2433425952e246b496f880dcccc5bba3"

RPROVIDES:${PN} += "config-icmake \
icmake"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
