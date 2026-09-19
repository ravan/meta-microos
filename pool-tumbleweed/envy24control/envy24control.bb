SUMMARY = "Control tool for Envy24 (ice1712) based soundcards"
DESCRIPTION = "envy24control is a GUI control tool for Envy24 (ice1712) based sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "envy24control-0.6.0-29.4.aarch64.rpm"
RPM_HASH = "a23a091736a433cbf2e74e327a45970aa7d5bab32b09924fc4471570c32235d36dd97fb3117693e4ff26ba4f40121587822819661c5e69ca303066f5f9d2b14c"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/envy24control \
envy24control"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
