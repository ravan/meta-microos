SUMMARY = "Library for accessing online serive APIs using MS Graph protocol"
DESCRIPTION = "libmsgraph is a GLib-based library for accessing online serive APIs using MS Graph protocol."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.5"

RPM_NAME = "typelib-1_0-Msg-1-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "5a9f433a6585419fd9d362388cf0f882dfccd66423c2a7b7a319b6cec46c32b8a283f9298c64ecf46b01ec38e9c44ea0fe3a3ab60751867f7b792769a15af971"

RPROVIDES:${PN} += "typelib-1-0-Msg-1 \
typelib-Msg"

RDEPENDS:${PN} += "libmsgraph-1.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Goa \
typelib-Json \
typelib-Soup"

inherit rpm
