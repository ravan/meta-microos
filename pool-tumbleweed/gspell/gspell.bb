SUMMARY = "A spell checker library for GTK+ applications"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "gspell-1.14.4-2.1.aarch64.rpm"
RPM_HASH = "9433bce0da10da7863039aaa4bc2cec5f9b3954eb66f3a3407cfef026c8aa20a92056b2988eb6507680c29e43997098f6b23a2f55f431f4e0b3980faa8273782"

RPROVIDES:${PN} += "gspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0"

inherit rpm
