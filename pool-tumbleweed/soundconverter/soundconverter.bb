SUMMARY = "Sound Converter Application for the GNOME Desktop"
DESCRIPTION = "A sound converter application for the GNOME environment. \
 \
It reads anything the GStreamer library can read, and offers writing \
to WAV, FLAC, MP3, AAC, and Ogg Vorbis, also with the help of GStreamer."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.5"

RPM_NAME = "soundconverter-4.0.5-2.2.aarch64.rpm"
RPM_HASH = "fe64f84080804547b53fd598b57ed478171f6ee3b2539d732639101b6f0cd3b2509dc1c6e2e5ba0f15963a28981f8819485f6099d9ecf433ab4212662cdf9119"

RPROVIDES:${PN} += "python3.13dist-soundconverter \
python3dist-soundconverter \
soundconverter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gstreamer \
gstreamer-plugins-base \
gstreamer-plugins-good \
python-abi \
python3-gobject \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-Notify \
typelib-Pango"

inherit rpm
