SUMMARY = "The X Keyboard Extension"
DESCRIPTION = "The X Keyboard Extension essentially replaces the core protocol \
definition of keyboard. The extension makes possible to clearly and \
explicitly specify most aspects of keyboard behaviour on per-key basis \
and to more closely track the logical and physical state of the \
keyboard. It also includes a number of keyboard controls designed to \
make keyboards more accessible to people with physical impairments."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "2.48"

RPM_NAME = "xkeyboard-config-2.48-1.2.noarch.rpm"
RPM_HASH = "483ea1c055ddb1cedf9cb0bc358219243b6e2d51e0635a25343421849c855583e939942e76cf46ed1752f68e37b8f772de2eea70517404a9312bf77dba1af335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xkeyboard-config \
pkgconfig-xkeyboard-config-2 \
xkeyboard-config"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils"

inherit rpm
