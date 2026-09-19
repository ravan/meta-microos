SUMMARY = "Collection of macros to help convert autotools based projects into CMake"
DESCRIPTION = "IGWN cmake macros is a collection of macros and scripts that were developed to \
aid in the process of converting Autotools based projects into CMake."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "igwn-cmake-macros-1.5.0-1.9.noarch.rpm"
RPM_HASH = "ef114a07ddb164544b8f33342026beec0ac924b81c09656b761ae174c480c7065997f90c40186519edae23182eea9d5e3c9b3f7053832b1403dd61be1adbab75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "igwn-cmake-macros \
pkgconfig-igwncmake"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
