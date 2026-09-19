SUMMARY = "Libpurple plugin to prevent Instant Message spam"
DESCRIPTION = "Bot Sentry is a libpurple plug-in to prevent Instant Message spam. \
It allows you to ignore IMs unless the sender is in your Buddy List \
or Allow List, or the sender correctly answers a question you have \
predefined."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libpurple-plugin-bot-sentry-1.3.0-3.3.aarch64.rpm"
RPM_HASH = "b27236e1830a33d5968f36c37ec017e067049fb988b1365611ba3b97c05aac8ed5599fd39cfbd94b0f6f53aec369684e571882ec75b7263fe839672e4e8785dc"

RPROVIDES:${PN} += "libpurple-plugin-bot-sentry \
pidgin-bot-sentry"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libpurple.so.0"

inherit rpm
