SUMMARY = "Generator for grommunio-web search indexes"
DESCRIPTION = "A C++17 program for the generation of grommunio-web fulltext search indexes."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "grommunio-index-1.3-1.9.aarch64.rpm"
RPM_HASH = "5d1c6f5378e0ec9a47bfd7b030866f171c73d6fd86a19f15d212bda90b24b8b67373d1de6f606ad8ea9e943b047427f8c69ec614f67066ef3501cc684bb76de5"

RPROVIDES:${PN} += "grommunio-index \
group-groindex \
user-groindex"

RDEPENDS:${PN} += "/usr/bin/sh \
group-gromoxcf \
group-groweb \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libexmdbpp.so.0 \
libexmdbpp0 \
libgcc-s.so.1 \
libmariadb.so.3 \
libsqlite3-0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
sysuser-shadow"

inherit rpm
