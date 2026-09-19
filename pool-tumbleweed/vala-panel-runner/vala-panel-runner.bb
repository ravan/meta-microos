SUMMARY = "Commands runner for vala-panel"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This is a simple commands runner for vala-panel."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-runner-0.5.0-1.18.aarch64.rpm"
RPM_HASH = "5e5a64d8ce833edb7fb366f909648b13707224b84cee844f4597a78e88301f021c9d79f7f2e3cbd1da383c42c91f6a92a891bf0486e3ce8a2670617686368b84"

RPROVIDES:${PN} += "vala-panel-runner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
vala-panel"

inherit rpm
