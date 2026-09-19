SUMMARY = "Development files for the Telepathy Framework Centralized Logging"
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

RPM_NAME = "telepathy-logger-devel-0.8.2-11.4.aarch64.rpm"
RPM_HASH = "c7be6083fa3bdf8108644c6920010c34d506bfa09111f29b883e8b7421e54c452d333936ff8a7896400eb2e19c3ca4110612eddf43905b617e14f714328e6087"

RPROVIDES:${PN} += "pkgconfig-telepathy-logger-0.2 \
pkgconfig-tpl-extensions \
telepathy-logger-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtelepathy-logger3 \
libtpl-extensions3 \
pkgconfig-libxml-2.0 \
pkgconfig-telepathy-glib \
typelib-1-0-TelepathyLogger-0-2"

inherit rpm
