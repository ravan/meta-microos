SUMMARY = "HardWare LiSter"
DESCRIPTION = "lshw (Hardware Lister) is a small tool to provide detailed informaton on the \
hardware configuration of the machine. It can report exact memory \
configuration, firmware version, mainboard configuration, CPU version and \
speed, cache config uration, bus speed, etc. on DMI-capable x86 systems and \
on some PowerPC machines (PowerMac G4 is known to work). \
 \
Information can be output in plain text, XML or HTML. \
 \
For detailed information on lshw features and usage, please see the \
included documentation or go to the lshw Web page, \
http://www.ezix.org/software/lshw.html"
LICENSE = "GPL-2.0-only"

PV = "B.02.20"

RPM_NAME = "lshw-B.02.20-3.3.aarch64.rpm"
RPM_HASH = "caa6d450958c87cf38c90e802014d4c48721883292bdace827826cd44df01ad1cc3bbc1eca43d881041aa67969c81bc5355713748c897dbf6fc5c16b75981adf"

RPROVIDES:${PN} += "lshw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
