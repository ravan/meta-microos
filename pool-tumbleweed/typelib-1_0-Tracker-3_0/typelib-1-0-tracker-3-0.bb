SUMMARY = "Introspection bindings for the tinysparql Sparql library"
DESCRIPTION = "tinysparql is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package provides the GObject Introspection bindings for the \
sparql library for tinysparql."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.1"

RPM_NAME = "typelib-1_0-Tracker-3_0-3.11.1-1.3.aarch64.rpm"
RPM_HASH = "b09081a573276782a18bd727abfa24655d693c14c2fb98bfb77b3b158cd85ceddd2f06bcf487797eedca74640d6c1c61cc573af03b092c0ddfd109c4e1a0c184"

RPROVIDES:${PN} += "typelib-1-0-Tracker-3-0 \
typelib-Tracker \
typelib-Tsparql"

RDEPENDS:${PN} += "libtinysparql-3.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
