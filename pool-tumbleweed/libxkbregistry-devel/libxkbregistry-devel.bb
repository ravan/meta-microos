SUMMARY = "Header files for xkbregistry"
DESCRIPTION = "libxkbregistry is a C library that lists available XKB models, \
layouts and variants for a given ruleset. \
 \
This is aimed at tools that provide a listing of available keyboard \
layouts to the user."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbregistry-devel-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "c9c3df54344f77bb867bec988ebea20076c6e289f1abe537317b726393c7c0500074aad191c70765397a31fa6b5377145ae00862688cf039b8a50d6a0248b26a"

RPROVIDES:${PN} += "libxkbregistry-devel \
pkgconfig-xkbregistry"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbregistry0 \
pkgconfig-libxml-2.0"

inherit rpm
