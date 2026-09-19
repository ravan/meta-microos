SUMMARY = "Utility library around OpenAL"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libalure1-1.2-6.4.aarch64.rpm"
RPM_HASH = "4e513d98c95092394690e0ae45839d2bd655c48dfb7fd336e8f19d6564581545538f5fce545be2fd4ff52126adc8ad42cb11892891b7de36c5f37a9e37b77eeb"

RPROVIDES:${PN} += "libalure.so.1 \
libalure1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libdumb.so.2 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libmodplug.so.1 \
libmpg123.so.0 \
libopenal.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
