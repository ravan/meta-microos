SUMMARY = "Libraries for multipath-tools"
DESCRIPTION = "libmpathpersist provides a C API for handling of SCSI persistent \
reservations for device-mapper multipath devices. libmpathcmd \
provides a C API for sending commands to a running multipathd \
instance."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & LGPL-2.0-or-later"

PV = "0.15.1+229+suse.6c6f63e"

RPM_NAME = "libmpath0-0.15.1+229+suse.6c6f63e-1.1.aarch64.rpm"
RPM_HASH = "e56a3e5507d82353ed30436e1043ce0d0e78fef53338d2cba8f5d10d6e63ed5d23c37eb6f7a68370a73d524f58b5a973e702ad26fa51de0e1e2eced2f2fb4086"

RPROVIDES:${PN} += "libcheckcciss-tur.so \
libcheckdirectio.so \
libcheckemc-clariion.so \
libcheckhp-sw.so \
libcheckrdac.so \
libcheckreadsector0.so \
libchecktur.so \
libforeign-nvme.so \
libmpath0 \
libmpathcmd.so.0 \
libmpathpersist.so.0 \
libmpathutil.so.0 \
libmpathvalid.so.0 \
libmultipath.so.0 \
libprioalua.so \
libprioana.so \
libprioconst.so \
libpriodatacore.so \
libprioemc.so \
libpriohds.so \
libpriohp-sw.so \
libprioiet.so \
libprioontap.so \
libpriopath-latency.so \
libpriorandom.so \
libpriordac.so \
libpriosysfs.so \
libprioweightedpath.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
libm.so.6 \
libmount.so.1 \
libudev.so.1 \
liburcu.so.8"

inherit rpm
