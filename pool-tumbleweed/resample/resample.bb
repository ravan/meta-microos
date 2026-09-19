SUMMARY = "Sampling-rate conversion program"
DESCRIPTION = "The resample program is a high-quality resampling program. For example, \
it can be used to convert the sampling rate from 48 kHz (used by DAT \
machines) to 44.1 kHz (the standard sampling rate for Compact Discs)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "resample-1.8.1-22.9.aarch64.rpm"
RPM_HASH = "c161cc7d5f3002aeeb04c6ceb9e090c4f111f06a71bdcf1604d4959dcfcdbbe4779be5a9ac43af26d4a70b680c2ce961b3fb328f193165f49c9a98d6f572042f"

RPROVIDES:${PN} += "resample"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
