SUMMARY = "PulseAudio's LADSPA plugin graphical user interface"
DESCRIPTION = "GUI for PulseAudio's LADSPA interface using Steve Harris' Multiband EQ \
(mbeq_1197) plugin."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "pulseaudio-equalizer-3.0.2-1.19.noarch.rpm"
RPM_HASH = "acf62a79916fdc94727d5a130c0159036e0135531536c4b2c3531b1eb4cdc62a94c8bb15ebd891db6870d71979ca7d342d561fd153785e94ab0659f918f5bece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pulseaudio-equalizer"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
bc \
ladspa-swh-plugins \
pulseaudio-daemon \
pulseaudio-utils \
python-abi \
python3-gobject \
python3-gobject-Gdk \
typelib-GLib \
typelib-Gio \
typelib-Gtk"

inherit rpm
