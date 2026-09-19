SUMMARY = "GTK Subtitle editor"
DESCRIPTION = "Gaupol is an editor for text-based subtitle files. It supports multiple subtitle \
file formats and provides means of correcting texts and timing subtitles to match \
video. The user interface is designed with attention to batch processing of \
multiple documents and convenience of translating. \
 \
Gaupol should run on all Unix-like (GNU/Linux, *BSD, etc.) operating systems and \
on Windows. Technically it should be able to run on Mac as well, but that has \
not been tested nor made convenient. Gaupol's user interface is based on the GTK+ \
toolkit and has been designed to best fit the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "1.15"

RPM_NAME = "gaupol-1.15-1.9.noarch.rpm"
RPM_HASH = "3cf5b3df74b8fb13aa14e28f409bf8257d735b3a2aefbe33d5e02373b26ae32185a5e3405f818a1011e9e1fb04d0a9f30e9da548712b0913baae52a0e0cfd202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gaupol \
python3.13dist-gaupol \
python3dist-gaupol"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3 \
python3-aeidon \
python3-gobject \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gspell \
typelib-Gst \
typelib-GstPbutils \
typelib-GstTag \
typelib-Gtk \
typelib-Pango"

inherit rpm
