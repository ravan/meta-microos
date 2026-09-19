SUMMARY = "Universal Plug'n'Play (UPnP) Client"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.3.3"

RPM_NAME = "miniupnpc-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "60af230734dce02a90bf5d76ee3f3c01a075da23ab5ef6056b36ce9ce474967d70c58ad165fa853ebfe6c7508d48eb6e7d317d57c746900797365151c10e8e24"

RPROVIDES:${PN} += "miniupnpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc.so.21 \
libminiupnpc21"

inherit rpm
