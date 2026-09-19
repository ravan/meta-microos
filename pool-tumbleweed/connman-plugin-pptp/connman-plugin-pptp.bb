SUMMARY = "PPTP plugin for connman"
DESCRIPTION = "Provides PPTP support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-pptp-1.42-2.16.aarch64.rpm"
RPM_HASH = "8ee4c607946763f70aacbe1a88c688af680f45934585a04a38f5fc553c0601ad00392e0b33dccba796085afcff2eb34e0cd2d334d1328917a2867b9c94ada8d3"

RPROVIDES:${PN} += "connman-plugin-pptp"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
