SUMMARY = "Xsynth an analog-style (VCAs-VCF-VCO) synth plugin"
DESCRIPTION = "The xsynth-dssi  package contains the Xsynth-DSSI plugin, \
a classic-analog (VCOs-VCF-VCA) style software synthesizer \
with an editor GUI. Xsynth-DSSI was written by Sean Bolton, \
and was based on Steve Brooke's Xsynth code, but has since \
aquired polyphonic operation, band-limited oscillators, \
a better filter mode, and velocity-sensitive envelopes. \
 \
Author: \
-------- \
    Sean Bolton <sean@smbolton.com>"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.4"

RPM_NAME = "xsynth-dssi-0.9.4-20.5.aarch64.rpm"
RPM_HASH = "468e316e487284a705bf53af175d38212262914444ba427b0770e25cde2ea7e531a72a858bea18436f63bc8e6d207a556a4652f4e3023ea6c86332e30346904a"

RPROVIDES:${PN} += "xsynth-dssi"

RDEPENDS:${PN} += "/sbin/ldconfig \
dssi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblo.so.7 \
libm.so.6 \
libmvec.so.1"

inherit rpm
