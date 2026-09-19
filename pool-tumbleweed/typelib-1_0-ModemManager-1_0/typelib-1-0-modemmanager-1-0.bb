SUMMARY = "Introspection bindings for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.24.2"

RPM_NAME = "typelib-1_0-ModemManager-1_0-1.24.2-1.6.aarch64.rpm"
RPM_HASH = "224d517194f55bf9f1b2be847690d7647520b594236b69e027757e5593a30cec23f281a7a69d60455c01a7dcf45cdd71b091cf7228a042d8d43970f769c4b9cd"

RPROVIDES:${PN} += "typelib-1-0-ModemManager-1-0 \
typelib-ModemManager"

RDEPENDS:${PN} += "libmm-glib.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
