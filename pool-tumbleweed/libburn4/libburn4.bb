SUMMARY = "Library for Writing Preformatted Data onto Optical Media"
DESCRIPTION = "Libburn is a library for writing preformatted data onto optical media such as \
CD, DVD, BD (Blu-Ray) and also offers a facility for reading data blocks from \
its drives without using the normal block device I/O."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "libburn4-1.5.8-1.3.aarch64.rpm"
RPM_HASH = "3baf20f3a7bb85de9927a982577de6b89e1f4350fd128e532411fb45225575fa02c5e3dd8ddbd6894046a5f21933d9f73458cc707a9628210fb13c33cb0c4d01"

RPROVIDES:${PN} += "libburn.so.4 \
libburn4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
