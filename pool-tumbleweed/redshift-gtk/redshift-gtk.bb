SUMMARY = "Gtk frontend for redshift"
DESCRIPTION = "A graphical user interface for the redshift tool that integrates into Gtk+ and GNOME."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "redshift-gtk-1.12-9.7.aarch64.rpm"
RPM_HASH = "9f8c3318a23beb0a1cafc54778eb66c7b354947309cb9c49b6d9d66cd6fed39dcd07283e1a53585cd115e340d4940f8964b9461fd7f45b01f3891c378cb25242"

RPROVIDES:${PN} += "redshift-gtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
hicolor-icon-theme \
python-abi \
python3-gobject-Gdk \
redshift \
systemd \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gtk"

inherit rpm
