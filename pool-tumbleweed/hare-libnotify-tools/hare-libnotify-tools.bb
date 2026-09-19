SUMMARY = "Hare clone of the notify-send tool"
DESCRIPTION = "An attempt to create Hare bindings for libnotify. This contains a clone of the notify-send tool."
LICENSE = "MPL-2.0"

PV = "1.0.1"

RPM_NAME = "hare-libnotify-tools-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "d995cfb5d25f806c36cf9ab2d94d699101eff331137b7ae756e26491e4b25a407a6b2919e001c61a6a7950e0191d743be07b4296c39f4effea8e68c82f955c41"

RPROVIDES:${PN} += "hare-libnotify-tools"

RDEPENDS:${PN} += "libc.so.6 \
libnotify.so.4"

inherit rpm
