SUMMARY = "Account management library for GLib Applications -- Introspection Bindings"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
accounts-glib library."
LICENSE = "LGPL-2.1-only"

PV = "1.27"

RPM_NAME = "typelib-1_0-Accounts-1_0-1.27-1.10.aarch64.rpm"
RPM_HASH = "a4f36d9c5e0e4aff680fc3be64ade13ace58d7698bc37e076eb6853c36887334dd27fd96defda6d23b901d64eee6dae2f79091a5510d67caab001636fbbf670d"

RPROVIDES:${PN} += "typelib-1-0-Accounts-1-0 \
typelib-Accounts"

RDEPENDS:${PN} += "libaccounts-glib.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
