SUMMARY = "Introspection bindings for the Telepathy Framework Centralized Logging"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus). \
 \
This package provides the GObject Introspection bindings for Telepathy Logger."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-TelepathyLogger-0_2-0.8.2-11.4.aarch64.rpm"
RPM_HASH = "e85965bd1cc3f202d6bf89a567aa5fe3a3a6cebdf7815c61dd3d038bdbbf3a27869f30bbc60618545f87cefa3963af96f1dd065425c47bbb35b9c84a5b3d4d24"

RPROVIDES:${PN} += "typelib-1-0-TelepathyLogger-0-2 \
typelib-TelepathyLogger"

RDEPENDS:${PN} += "libtelepathy-logger.so.3 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-TelepathyGLib"

inherit rpm
