SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.3.3"

RPM_NAME = "python314-miniupnpc-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "783834e2b9d95c8eab09d52ce26fc379700a8cff3e778e44e091497f9884f77d05d79c4b0d7a1b2db469b3140634657de5ac4e19f319d93ef6ef063db4b1e762"

RPROVIDES:${PN} += "python3.14dist-miniupnpc \
python314-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc21 \
python-abi"

inherit rpm
