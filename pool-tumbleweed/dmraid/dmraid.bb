SUMMARY = "A Device-Mapper Software RAID Support Tool"
DESCRIPTION = "This software discovers, activates, deactivates, and displays \
properties of software RAID sets, such as ATARAID, and contained DOS \
partitions. \
 \
dmraid uses libdevmapper and the device-mapper kernel runtime to create \
devices with respective mappings for the ATARAID sets discovered. \
 \
The following ATARAID types are supported: \
 \
- Highpoint HPT37X \
 \
- Highpoint HPT45X \
 \
- Intel Software RAID \
 \
- Promise FastTrak \
 \
- Silicon Image Medley"
LICENSE = "GPL-2.0-only"

PV = "1.0.0.rc16.3"

RPM_NAME = "dmraid-1.0.0.rc16.3-4.5.aarch64.rpm"
RPM_HASH = "1a83e232dc117390609474a6df29e2ae34a90bc23772bfa2c15a78e8be37f9218665001009c67ce1afbf660b6f5deb55cdbc11f999fc135bc9509531677269e6"

RPROVIDES:${PN} += "dmraid \
libdmraid-events-isw.so \
libdmraid.so.1"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
aaa-base \
coreutils \
fillup \
kpartx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
systemd"

inherit rpm
