SUMMARY = "Linux 'VBI proxy'"
DESCRIPTION = "With 'video4linux' drivers, only one application at a time can capture \
VB data.  The 2nd generation 'v4l2' API allows multiple clients to \
open a device, but still only one client may read from the device.  If, \
for example, the Nxtvepg daemon runs in the background, users will not be \
able to start a Teletext application.  The VBI proxy was developed as a \
solution to this problem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.45"

RPM_NAME = "zvbi-0.2.45-1.1.aarch64.rpm"
RPM_HASH = "c765977002b8685fbc1f6b5b40092dcfa225caacbd0b2a60fbb4f7643922f5e272b6ff2374be1c67dde49cc0544a0335fe06ab83f4c8cfafdfe70a97a3e9e04f"

RPROVIDES:${PN} += "zvbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libzvbi.so.0"

inherit rpm
