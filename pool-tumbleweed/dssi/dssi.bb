SUMMARY = "Disposable Soft Synth Interface"
DESCRIPTION = "Disposable Soft Synth Interface (DSSI, pronounced 'dizzy') is a \
proposal for a plug-in API for software instruments (soft synths) with \
user interfaces, permitting them to be hosted in-process by Linux audio \
applications. Think of it as LADSPA-for-instruments or something \
comparable to a simpler version of VSTi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.1.1"

RPM_NAME = "dssi-1.1.1-14.8.aarch64.rpm"
RPM_HASH = "0e0b26226dfee32dddb57d25208c5c1da27a2c4e90706987cffdb765a74a876ac2f4c6c3ae5bdfd4f5d4983f469b98009ea1c1d1933b680e0479e1bfb83a7002"

RPROVIDES:${PN} += "dssi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
