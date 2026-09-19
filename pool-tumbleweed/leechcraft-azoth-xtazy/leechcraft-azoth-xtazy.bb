SUMMARY = "LeechCraft Azoth Module for publishing current user tune"
DESCRIPTION = "This package provides an Azoth plugin which allows to publish \
the current user tune."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-xtazy-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a77c7930626a037ab797addfc6146db93ffe9981886f15413650620f6e194ca8dbb1bbffc7aa8e2f7b84372352dbc8a11c00d1993546c6f36075a20165eedb7b"

RPROVIDES:${PN} += "leechcraft-azoth-xtazy \
libleechcraft-azoth-xtazy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
leechcraft-xtazy \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
