SUMMARY = "Glade catalog for GTKDataBox"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "glade-catalog-gtkdatabox-1.0.0-1.21.aarch64.rpm"
RPM_HASH = "e94055fda486b20c75ab709f0f812461c7630078292e080d52263a02f911b07d5219812e8b275c895cda0e78c88cd486d5f8f0edcbae271be38e17684481d85f"

RPROVIDES:${PN} += "glade-catalog-gtkdatabox \
libgladedatabox.so"

RDEPENDS:${PN} += "libgladeui-2.so.13 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkdatabox.so.1"

inherit rpm
