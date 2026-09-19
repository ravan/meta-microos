SUMMARY = "MIDI instrument patch library"
DESCRIPTION = "libInstPatch stands for lib-Instrument-Patch and is a library for processing \
digital sample based MIDI instrument 'patch' files. The types of files \
libInstPatch supports are used for creating instrument sounds for wavetable \
synthesis. libInstPatch provides an object framework (based on GObject) to load \
patch files into, which can then be edited, converted, compressed and saved. \
 \
This package contains the library of libinstpatch."
LICENSE = "LGPL-2.1-only"

PV = "1.1.7"

RPM_NAME = "libinstpatch-1_0-2-1.1.7-1.5.aarch64.rpm"
RPM_HASH = "c3a8e04e70fe3fdc3b1e442cccd310c3399d07b6b144cd361fefd2535f00d369a48f10dd6b44ebc4c894ed69660be707b391348b4d63ae68756e9956aca74b4e"

RPROVIDES:${PN} += "libinstpatch-1-0-2 \
libinstpatch-1.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
