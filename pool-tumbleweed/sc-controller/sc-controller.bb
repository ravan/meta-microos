SUMMARY = "User-mode driver, mapper, and GTK3-based GUI for the Steam Controller and many other controllers."
DESCRIPTION = "User-mode driver and GTK3-based GUI for game controllers, including but not limited to the Steam Controller (2015 & 2026)."
LICENSE = "GPL-2.0-only"

PV = "0.7.2"

RPM_NAME = "sc-controller-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "a15c65cdc91bd12511b5481d38e6ef4f292b3546fe3770e0ba143e6432c4846a486b5e14d5ff26b2c1fc543c711a2c4159edb8edf5eee9d17dec36569fcca116"

RPROVIDES:${PN} += "libcemuhook.cpython-313-aarch64-linux-gnu.so \
libhiddrv.cpython-313-aarch64-linux-gnu.so \
libremotepad.cpython-313-aarch64-linux-gnu.so \
libsc-by-bt.cpython-313-aarch64-linux-gnu.so \
libuinput.cpython-313-aarch64-linux-gnu.so \
python3.13dist-sccontroller \
python3dist-sccontroller \
sc-controller"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python3-gobject-Gdk \
python3-ioctl-opt \
python3-libusb1 \
python3-pycairo \
python3-pylibacl \
python3-setuptools \
python3-vdf \
typelib-AppIndicator3 \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-GtkLayerShell \
typelib-Pango \
typelib-Rsvg"

inherit rpm
