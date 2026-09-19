SUMMARY = "Extensions for the Telepathy Framework Centralized Logging"
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

RPM_NAME = "libtpl-extensions3-0.8.2-11.4.aarch64.rpm"
RPM_HASH = "a8e29297ad92b49c8407607a87f7a74b0abefe9a82ec06e2127a3fc53840ef99c5bde72d91813a5951b30e6c96863a61d4c7e851db4e12206505b6b2e725df79"

RPROVIDES:${PN} += "libtpl-extensions.so.3 \
libtpl-extensions3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
