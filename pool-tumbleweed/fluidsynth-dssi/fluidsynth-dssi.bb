SUMMARY = "Fluidsynth Plug-In for Disposable Soft Synth Interface"
DESCRIPTION = "FluidSynth-DSSI is the plug-in implementation of fluidsynth on DSSI \
(Disposable Soft Synth Interface) with a GTK+ GUI."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.9+git13012019"

RPM_NAME = "fluidsynth-dssi-1.9.9+git13012019-2.4.aarch64.rpm"
RPM_HASH = "5856710e34c1d998c226a17db458cc7cfffd4035a019c4b632d38d9ebb9a8915f1e1383160832d2de43cb5fb15d3e8e61ed94b624e720429f26aa1bfd3f70206"

RPROVIDES:${PN} += "fluidsynth-dssi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblo.so.7 \
libm.so.6"

inherit rpm
