SUMMARY = "Battle for Wesnoth: campaign server"
DESCRIPTION = "The campaign server acts as a simple download server, much like ftp, to \
provide a collection of Wesnoth campaigns to players."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.18.8"

RPM_NAME = "wesnoth-campaign-server-1.18.8-1.1.aarch64.rpm"
RPM_HASH = "ee6fc6d804a2083128ae97db7936c3806698fa38ac994f57dde139e6cde9078bacdf1d26227c827e6d619465839baefdc9f8fca17e32bd296ec6bcdcccf155b9"

RPROVIDES:${PN} += "wesnoth-campaign-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-random.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
wesnoth-fslayout"

inherit rpm
