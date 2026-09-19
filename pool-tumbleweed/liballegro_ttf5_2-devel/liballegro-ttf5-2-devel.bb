SUMMARY = "Development files for liballegro_ttf"
DESCRIPTION = "Development files needed to build applications which use liballegro_ttf."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_ttf5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "8c338d4bcce583ff0bed93e032b15dd39e0ede8de8b57680d6542f18d6be173ad79f93e4cfdef7d19c16fdde0b6ce3974402671d7d0db4131788bb6ebd12c598"

RPROVIDES:${PN} += "liballegro-ttf5-2-devel \
pkgconfig-allegro-ttf-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-ttf5-2 \
pkgconfig-allegro-font-5"

inherit rpm
