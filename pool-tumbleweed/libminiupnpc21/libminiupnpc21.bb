SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.3.3"

RPM_NAME = "libminiupnpc21-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "cb4ab28bb6e2c3d3bc4d9af121391c012f887ca6e80275d7b26061697eaf0eabab1d77f12552118863fbdd4303d7c8f4c24a17dc331ceda3fe0905f5e9fbd253"

RPROVIDES:${PN} += "libminiupnpc.so.21 \
libminiupnpc21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
