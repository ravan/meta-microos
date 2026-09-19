SUMMARY = "Synchronized lyrics in your terminal"
DESCRIPTION = "An application for a variety of different music players that displays \
lyrics on the terminal to your favorite songs while they're playing. \
Compatible with Spotify, MPD, Mopidy, MPRIS, and browsers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "sptlrx-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "094961cee68c4b535c30e669d7ebd1305efc4083d61e89c0aafcfc7d42219b8705ae12b6e220f35b665017085410946c797a752b0b3b69d2b22b67b3c222ed11"

RPROVIDES:${PN} += "sptlrx"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
