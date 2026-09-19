SUMMARY = "MATE Desktop keyboard configuration development files"
DESCRIPTION = "libmatemixer is a mixer library for MATE desktop. \
 \
It provides an abstract API allowing access to mixer functionality \
available in the PulseAudio, ALSA and OSS sound systems."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "libmatemixer-devel-1.28.0-1.10.aarch64.rpm"
RPM_HASH = "1da1691b0499cc01e455651c40c51b6e5c18c4bc7caeb9c85c3a53970913e4420fe5f32c14284e4ea96cba86347277c7bb6a893ab6b581d9a65ef0e868fe1467"

RPROVIDES:${PN} += "libmatemixer-devel \
pkgconfig-libmatemixer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatemixer0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
