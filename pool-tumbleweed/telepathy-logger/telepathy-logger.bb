SUMMARY = "Centralized Logging for the Telepathy Framework"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "telepathy-logger-0.8.2-11.4.aarch64.rpm"
RPM_HASH = "f39bf776674dbeb141106f71bdf432ee7443213b1c2f8d9f87da1d9c13dd51af273362b43d765807da2ea99196c6f769f23db4d3217eba554268c303ac134b33"

RPROVIDES:${PN} += "telepathy-logger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0 \
libtelepathy-logger.so.3"

inherit rpm
