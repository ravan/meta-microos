SUMMARY = "LSC Algorithm Simulation Library"
DESCRIPTION = "The LSC Algorithm Simulation Library for gravitational wave data analysis. This \
package contains the shared-object libraries needed to run applications \
that use the LAL Simulation library."
LICENSE = "GPL-2.0-only"

PV = "6.2.0"

RPM_NAME = "python313-lalsimulation-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "58ef6a042d081c54e72afb9053a9d0873a9c766b60e9bf583e480ae31a83081b686359fd9c534e8fe87c5254aaa83f7641572876e8b3021a35d81e1b7cf2dd3f"

RPROVIDES:${PN} += "python3-lalsimulation \
python313-lalsimulation"

RDEPENDS:${PN} += "lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python313-lal \
python313-numpy"

inherit rpm
