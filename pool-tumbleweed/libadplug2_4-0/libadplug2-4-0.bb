SUMMARY = "AdLib Sound Player Library"
DESCRIPTION = "AdPlug is a hardware independent AdLib sound player library. \
AdPlug plays sound data, originally created for the AdLib (OPL2) and \
Sound Blaster (Dual OPL2/OPL3) audio boards, directly from its original \
format on top of an emulator or by using the real hardware. \
No OPL chip is required for playback."
LICENSE = "LGPL-2.1-only"

PV = "2.4"

RPM_NAME = "libadplug2_4-0-2.4-1.7.aarch64.rpm"
RPM_HASH = "bf8c34b0ecbde00db84ceaee1d639d6fb8d9dfc68a19ecb854d9a08ab9df610f9fa570fd30fb94cf1837cb9cb771b7807250aef1db414d4840149feef9c4227e"

RPROVIDES:${PN} += "libadplug-2.4.so.0 \
libadplug2-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbinio.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
