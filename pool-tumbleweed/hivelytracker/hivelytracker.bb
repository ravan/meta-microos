SUMMARY = "Music tracker for AHX and HVL formats"
DESCRIPTION = "Hively Tracker is a tracker program based upon the AHX format created \
in the mid '90s by Dexter and Pink of Abyss. The format was relatively \
popular, and many songs were created and used in scene productions and \
games. AHX was designed to create a very SID-like sound on the Amiga. \
 \
HivelyTracker can import and export modules and instruments in the AHX \
format, but it also improves on AHX in several ways and therefore has \
its own instrument and module formats. \
 \
HivelyTracker offers the following features over AHX: \
 * Multichannel (4 to 16 channels) \
 * Per-channel stereo panning \
 * Two commands per note instead of one \
 * Ring modulation \
 * A more feature rich editor"
LICENSE = "BSD-3-Clause"

PV = "1.9"

RPM_NAME = "hivelytracker-1.9-2.9.aarch64.rpm"
RPM_HASH = "e427a9cc61a33623859260ad8bfc804b0d62ff494efe5f44bf6aa972a837bdebacd53b0049febbc3aca653853b6099366c2f1845c6c5ec9427aa48448da236e8"

RPROVIDES:${PN} += "hivelytracker"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
texlive-dejavu-fonts"

inherit rpm
