SUMMARY = "LSC Algorithm Frame Library for gravitational wave data analysis"
DESCRIPTION = "The LSC Algorithm Frame Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "python314-lalframe-3.0.7-1.5.aarch64.rpm"
RPM_HASH = "e3370c46e712d51a3c3d0d1489266a12d95ec800f62ef5a2dc0881cbb7bce75c9ce890ca4ea0189a477a8ee7b16d66312aedec88bce1e2b235ec3736d177fd6b"

RPROVIDES:${PN} += "python314-lalframe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalframe.so.14 \
liblalsupport.so.14 \
python-abi \
python314-lal \
python314-numpy"

inherit rpm
