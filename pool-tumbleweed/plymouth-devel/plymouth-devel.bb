SUMMARY = "Libraries and headers for writing Plymouth splash plugins"
DESCRIPTION = "This package contains the libply and libplybootsplash libraries \
and headers needed to develop 3rd party splash plugins for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-devel-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "37ee8e094ad3796d5489c4b83e1f6251ddac4362fc73e366a903cd2e4343f551a0f70c8bb038a4aae2136927826b004a67cc92c1a16db9f21e1573c5545e7dbc"

RPROVIDES:${PN} += "pkgconfig-ply-boot-client \
pkgconfig-ply-splash-core \
pkgconfig-ply-splash-graphics \
plymouth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libply-boot-client5 \
libply-splash-core5 \
libply-splash-graphics5 \
libply5 \
pkgconfig \
pkgconfig-ply-splash-core \
plymouth"

inherit rpm
