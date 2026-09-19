SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library. \
 \
NOTE: This package is built from the sources found at \
https://src.opensuse.org/mia/python-adblock"
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0+14.compat.g9e997bcbd"

RPM_NAME = "python313-adblock-0.6.0+14.compat.g9e997bcbd-1.6.aarch64.rpm"
RPM_HASH = "0a7a9468a98f5f46cc64f424f881ce122fafd07ebc3f5e1830cf7aaddcce6724bcd9066ecd4da79cbabc5d49bf28f43fc89408394d86ac4f8ba9bc5e95b61d11"

RPROVIDES:${PN} += "python3-adblock \
python3.13dist-adblock \
python313-adblock \
python3dist-adblock"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
