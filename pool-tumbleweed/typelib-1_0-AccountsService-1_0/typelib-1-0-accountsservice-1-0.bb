SUMMARY = "Introspection bindings for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides the GObject Introspection bindings for the \
client library."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "typelib-1_0-AccountsService-1_0-23.13.9-12.3.aarch64.rpm"
RPM_HASH = "6aa5d88f1312eb6050ea3758c6a65027a731deecaa3c91a765b94b0cbcdb9092780bd883614507cb279298d2099314e011737d670c911e62ee22a0ce1b81f487"

RPROVIDES:${PN} += "typelib-1-0-AccountsService-1-0 \
typelib-AccountsService"

RDEPENDS:${PN} += "libaccountsservice.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
