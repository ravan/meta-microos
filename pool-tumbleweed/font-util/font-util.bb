SUMMARY = "X.Org font package creation/installation utilities"
DESCRIPTION = "This package provides utilities for X.Org font package \
creation/installation."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "font-util-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "fbacd6d191429141eb8e0405fcba4208a02d4b79ce329ab3f87ecca18b46699c081dc54c0df1ee48e62440dad690c8b7126c93d7e2443fcaa3b4931d5e2c2ab8"

RPROVIDES:${PN} += "font-util \
pkgconfig-fontutil \
xorg-x11-fonts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
