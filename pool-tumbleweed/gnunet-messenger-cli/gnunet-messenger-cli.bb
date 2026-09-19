SUMMARY = "Terminal application using the GNUnet Messenger service"
DESCRIPTION = "A terminal application using the GNUnet Messenger service."
LICENSE = "AGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "gnunet-messenger-cli-0.4.0-1.5.aarch64.rpm"
RPM_HASH = "3a2bc92388f3aec28ee80cb64702e5bdedd4d13308f31379255f4eb3636895332d086391af4c55099c529c8aeb2ba66b3af548b28f9892b6d598a21f6c63045e"

RPROVIDES:${PN} += "gnunet-messenger-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetchat.so \
libgnunetutil.so.20 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
