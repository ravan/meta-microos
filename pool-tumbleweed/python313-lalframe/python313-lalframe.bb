SUMMARY = "LSC Algorithm Frame Library for gravitational wave data analysis"
DESCRIPTION = "The LSC Algorithm Frame Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "python313-lalframe-3.0.7-1.5.aarch64.rpm"
RPM_HASH = "872a551675711170c34979f3df5dbee937be523a7c521213dfd96c02bad82d9a2c8284bca6e8a4d0f5dbbb6e992568a7c320ff95663c1a359174890d9746a59d"

RPROVIDES:${PN} += "python3-lalframe \
python313-lalframe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalframe.so.14 \
liblalsupport.so.14 \
python-abi \
python313-lal \
python313-numpy"

inherit rpm
