SUMMARY = "Fish Fillets - Next Generation"
DESCRIPTION = "Fish Fillets is strictly a puzzle game. The goal in each of the 70 \
levels is always the same: find a safe way out. The fish utter witty \
remarks about their surroundings and the various inhabitants of their \
underwater realm quarrel among themselves or comment on the efforts of \
your fish. The whole game is accompanied by quiet, comforting music."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "fillets-ng-1.0.1-6.5.aarch64.rpm"
RPM_HASH = "c8baca78cf2b3d03fb003166f7bbaa6abc78909e24ca1ddd616deb0840cec523bbf2e9ba62e03440ed20ffe9f10afdc57dcbdeb89dc94a38f2748dead54d3c67"

RPROVIDES:${PN} += "fillets-ng"

RDEPENDS:${PN} += "fillets-ng-data \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
