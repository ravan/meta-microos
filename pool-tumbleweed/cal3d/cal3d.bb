SUMMARY = "A 3D character animation library"
DESCRIPTION = "Cal3D is a skeletal based 3D character animation library written \
in C++ in a platform-/graphic API-independent way. Originally \
designed to be used in a 3D client for Worldforge, it evolved \
into a stand-alone product which can be used in many different \
kinds of projects. It supports combining animations and actions \
through a 'mixer' interface, and work is currently underway to \
integrate morph targets (interpolating between one mesh and \
another, using the same vertex sequence) easily into the system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.120"

RPM_NAME = "cal3d-0.120-5.7.aarch64.rpm"
RPM_HASH = "2b74cd3a9ee4ab77089391b280c18659a028b5ed7ce9248556e7edb2c7af0a891905198e7f680003f3e3e62b555c4313d7b2baa8685dc8e9a80d7b0a15aa238e"

RPROVIDES:${PN} += "cal3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcal3d.so.12 \
libcal3d12 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig"

inherit rpm
