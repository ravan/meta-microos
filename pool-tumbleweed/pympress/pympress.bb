SUMMARY = "A simple and powerful dual-screen PDF reader designed for presentations"
DESCRIPTION = "Pympress is a PDF presentation tool designed for dual-screen setups such as \
presentations and public talks. \
 \
Highly configurable, fully-featured, and portable, pympress comes with many \
great features, including: \
- supports embedded gifs, video, and audio \
- text annotations displayed in the presenter window \
- natively supports beamer's “notes on second screen”, as well as Libreoffice \
  notes pages \
- and much more"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.6"

RPM_NAME = "pympress-1.8.6-1.5.noarch.rpm"
RPM_HASH = "e371f439fe1552ef62cf0517bdacd1c6c65d7aa287fa45b66b87cc55745efdcd8b595a830a07f3f09700aef08af8e7c4bab046219d13e8d02b6c1c07cdc864d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pympress \
python3.13dist-pympress \
python3dist-pympress"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
gobject-introspection \
gstreamer \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-good-gtk \
gtk3 \
permissions \
python-abi \
python3-gobject \
python3-watchdog \
typelib-DBus \
typelib-DBusGLib \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAllocators \
typelib-GstApp \
typelib-GstAudio \
typelib-GstVideo \
typelib-Gtk \
typelib-Poppler \
typelib-cairo"

inherit rpm
