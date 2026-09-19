SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library. \
 \
NOTE: This package is built from the sources found at \
https://src.opensuse.org/mia/python-adblock"
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0+14.compat.g9e997bcbd"

RPM_NAME = "python314-adblock-0.6.0+14.compat.g9e997bcbd-1.6.aarch64.rpm"
RPM_HASH = "beacef2178629ac788204a00ca25ae2c5df715d481298badc717f04acce55a03b627a80087b0af3d3459e66f2628e9a358435c1828671cb7371923ea81cf22f1"

RPROVIDES:${PN} += "python3.14dist-adblock \
python314-adblock \
python3dist-adblock"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
