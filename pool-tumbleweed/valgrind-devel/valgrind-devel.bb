SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the Valgrind header files."
LICENSE = "GPL-2.0-or-later"

PV = "3.27.1"

RPM_NAME = "valgrind-devel-3.27.1-1.4.aarch64.rpm"
RPM_HASH = "f3f1a65d3433dc54df8fa0195603356aea96c7b5d4b21a27e01059cf6613e24d12a6dc49a44c0bf416519916cfc77ac478267c43daad33b8d176a435fc15a1dd"

RPROVIDES:${PN} += "pkgconfig-valgrind \
valgrind-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
valgrind \
valgrind-client-headers"

inherit rpm
