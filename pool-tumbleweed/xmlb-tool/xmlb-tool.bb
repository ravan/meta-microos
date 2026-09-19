SUMMARY = "Optional tool for libxmlb"
DESCRIPTION = "This package provides the optional xb-tool for libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.29"

RPM_NAME = "xmlb-tool-0.3.29-2.1.aarch64.rpm"
RPM_HASH = "a1aba7bbc4217cc42419c4e44f8b68af8b6a6b90b9dc13ca91197c93e57e7e9710770fd9efa8f9d4e853334485320b8cd99deac9ed676a7308150296c50bfa9e"

RPROVIDES:${PN} += "xmlb-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxmlb.so.2"

inherit rpm
