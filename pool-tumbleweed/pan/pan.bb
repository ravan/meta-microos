SUMMARY = "A Newsreader for GNOME"
DESCRIPTION = "Pan is a Usenet newsreader that's good at both text and binaries. \
It supports offline reading, scoring and killfiles, yEnc, NZB, PGP \
handling, multiple servers, and secure connections."
LICENSE = "GPL-2.0-or-later"

PV = "0.165"

RPM_NAME = "pan-0.165-1.3.aarch64.rpm"
RPM_HASH = "3b6bce9c23bf89ebc1c8961abd353bd1103b8f6a1f9588ce7cf5a86449737a4010435cc015da7d83358a94d43dff7328a53184c71afe451f82fab17664e18000"

RPROVIDES:${PN} += "pan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
