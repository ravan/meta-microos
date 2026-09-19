SUMMARY = "Tool for storage management"
DESCRIPTION = "barrel is a command line tool for storage management."
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "barrel-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "49c0d6a5b648cb26fccb9f77fc96fec4ae62bcad2dde9770b176bdbe6b67305ddcf2b2f8df90292b68a4ee4cda60d79752b39917a5de0159fba2c9cd7122d0bd"

RPROVIDES:${PN} += "barrel \
config-barrel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libreadline.so.8 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
