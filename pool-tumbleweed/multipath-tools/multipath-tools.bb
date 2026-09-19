SUMMARY = "Tools to Manage Multipathed Devices with the device-mapper"
DESCRIPTION = "This package provides the multipath tool and the multipathd daemon \
to manage dm-multipath devices. multipath can detect and set up \
multipath maps. multipathd sets up multipath maps automatically, \
monitors path devices for failure, removal, or addition, and applies \
the necessary changes to the multipath maps to ensure continuous \
availability of the map devices."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "0.15.1+229+suse.6c6f63e"

RPM_NAME = "multipath-tools-0.15.1+229+suse.6c6f63e-1.1.aarch64.rpm"
RPM_HASH = "9523138c69b9c1f14b680a5c8f5a061aec21445c65b2a36d73e192e6daa13a7c06456bde303c0b72a75d7845535bb2adc0cf91cf815a8b091fe1f99a4e19de74"

RPROVIDES:${PN} += "multipath-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
device-mapper \
grep \
kpartx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
libmpathcmd.so.0 \
libmpathpersist.so.0 \
libmpathutil.so.0 \
libmultipath.so.0 \
libsystemd.so.0 \
liburcu.so.8 \
sg3-utils \
suse-module-tools \
systemd"

inherit rpm
