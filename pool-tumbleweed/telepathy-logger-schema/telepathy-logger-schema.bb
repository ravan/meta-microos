SUMMARY = "Required schema for the Telepathy Framework Centralized Logging"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus). \
 \
This package provides required GSettings schemas for the tp-logger library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "telepathy-logger-schema-0.8.2-11.4.noarch.rpm"
RPM_HASH = "015d9aa5e7b3785a27b8792a21de35d8d976e9f5864362cc21de902d2a1b9b827d0146c829cc5f579b537946b89059d2028830c6c44efde2ea1b0b76d1df66aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "telepathy-logger-schema"

RDEPENDS:${PN} += ""

inherit rpm
