SUMMARY = "Headers for compiling games using GameMode"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
This package contains the headers required to compile games with \
built-in GameMode support."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "libgamemode-devel-1.8.2-1.9.aarch64.rpm"
RPM_HASH = "8968886990f733dfe4cff7e417b7052e520fa9f0c71dced40c368205fcf7169b6fa72edf242e2fd2ce299b054cecd9a2b8622873666553c6198265780c6febd2"

RPROVIDES:${PN} += "libgamemode-devel \
pkgconfig-gamemode \
pkgconfig-libgamemodeauto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgamemode0 \
libgamemodeauto0"

inherit rpm
