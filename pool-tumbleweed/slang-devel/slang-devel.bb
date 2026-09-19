SUMMARY = "Programming Library and Embeddable Extension Language - Development Package"
DESCRIPTION = "S-Lang is a programming library for creating multi-platform software. \
It provides display/screen management, keyboard input, keymaps, etc. \
Another feature is the interpreter for the S-Lang extension language \
which can be embedded into an application to make it extensible. With \
slsh, a standalone interpreter is available as well. \
 \
This package contains all necessary include files and libraries needed to \
develop applications that require it."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3+git16.89d32bb"

RPM_NAME = "slang-devel-2.3.3+git16.89d32bb-2.7.aarch64.rpm"
RPM_HASH = "c33ea981767ff65468038907346732816c9efa762af6a609bf625d3396f3e7b382fb702af5f39c06275443ab206fa41e01f176ee719615f5e343129c7b658dbc"

RPROVIDES:${PN} += "pkgconfig-slang \
slang-/usr/include/slang.h \
slang-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libslang2"

inherit rpm
