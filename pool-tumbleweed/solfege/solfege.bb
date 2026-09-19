SUMMARY = "An ear training program"
DESCRIPTION = "Solfege is an eartraining program for X written in python, using \
the GTK+ and GNOME libraries. To use this software you need some \
basic knowledge about music theory. Using solfege you can learn \
to recognise melodic and harmonic intervals, compare interval \
sizes, sing the intervals the computer asks for, identify chords, \
sing chords, scales, dictation and remember rhythmic patterns."
LICENSE = "GPL-3.0-or-later"

PV = "3.23.4"

RPM_NAME = "solfege-3.23.4-9.2.aarch64.rpm"
RPM_HASH = "f0863165ea464866a75fd5515c13e866f42709c632b9dc11d82a1311e97b3c520d4f5311daee11f445ae89099c7279ba9295620d1387045dbc461dba81c88557"

RPROVIDES:${PN} += "config-solfege \
solfege"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
lilypond-fonts-common \
python3-gobject-Gdk \
timidity \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Pango"

inherit rpm
