SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.3.3"

RPM_NAME = "libminiupnpc-devel-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "c586457e632bb0cf93298cad7a35bdb5e5da551e2f5d1265cc2cde8163f8b7155b2de3d761899a8c409fe8c2893d93132873720684bd504ed60cea3c295de912"

RPROVIDES:${PN} += "cmake-miniupnpc \
libminiupnpc-devel \
pkgconfig-miniupnpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminiupnpc21"

inherit rpm
