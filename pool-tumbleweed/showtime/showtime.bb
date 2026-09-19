SUMMARY = "Video player"
DESCRIPTION = "Watch without distraction. \
 \
Play your favorite movies and video files without hassle. Showtime \
features simple playback controls that fade out of your way when \
you're watching, fullscreen, adjustable playback speed, multiple \
language and subtitle tracks, and screenshots — everything you need \
for a straightforward viewing experience."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+19"

RPM_NAME = "showtime-50.0+19-1.2.noarch.rpm"
RPM_HASH = "274043f07aa8ead1b93750c708a25aee16ebba7275299affa30e5af0b321c52b102ac6c660994594c9f2294ec343c865a6c8f0414b8f2a882c2890160e0b0eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "showtime"

RDEPENDS:${PN} += "/usr/bin/python3 \
gstreamer-plugins-rs \
python-abi \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-GstPlay \
typelib-Gtk"

inherit rpm
