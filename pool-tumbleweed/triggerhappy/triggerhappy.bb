SUMMARY = "Lightweight hotkey daemon"
DESCRIPTION = "Triggerhappy \
- a lightweight hotkey daemon - \
 \
by Stefan Tomanek <stefan.tomanek+th@wertarbyte.de> \
http://github.com/wertarbyte/triggerhappy/ \
 \
Triggerhappy is a hotkey daemon developed with small and embedded systems in \
mind, e.g. linux based routers. It attaches to the input device files and \
interprets the event data received and executes scripts configured in its \
configuration."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "triggerhappy-0.5.0-3.15.aarch64.rpm"
RPM_HASH = "399b44208ffa4d295b05f4bbac0e2cd494fd0491b2a4fadf1151b62293a83fa667ca43bd1469f66fe81d4330bb8ef45e5aa5d66e61afee99fde301b8322da24f"

RPROVIDES:${PN} += "triggerhappy"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libsystemd.so.0"

inherit rpm
