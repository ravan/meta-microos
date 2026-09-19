SUMMARY = "Files needed for gkrellm2 development"
DESCRIPTION = "Files needed to build plugins for gkrellm2"
LICENSE = "GPL-3.0-or-later"

PV = "2.5.1"

RPM_NAME = "gkrellm-devel-2.5.1-1.3.aarch64.rpm"
RPM_HASH = "c983afe26f7093eb5d4457da61f67640755bce9a30aa8c82bf72d99c026d3a686f5e6ab7d65598304d1b5d713ea840a4ac9a4bb1680e2aeb4d6aa35b0b558746"

RPROVIDES:${PN} += "gkrellm-devel \
pkgconfig-gkrellm \
pkgconfig-gkrellmd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gkrellm \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
