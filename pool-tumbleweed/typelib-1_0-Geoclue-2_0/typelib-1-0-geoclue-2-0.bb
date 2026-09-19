SUMMARY = "GeoLocation Framework --GObject Introspection"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "typelib-1_0-Geoclue-2_0-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "504996ca21779af1b41481901409e805ef4aa98d8468f867f93b6e8c636f1ae297ee490c5f8bd29cbca7eaf967c773bd6e92c58d86e7e749afc69f1de63706c8"

RPROVIDES:${PN} += "typelib-1-0-Geoclue-2-0 \
typelib-Geoclue"

RDEPENDS:${PN} += "libgeoclue-2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
