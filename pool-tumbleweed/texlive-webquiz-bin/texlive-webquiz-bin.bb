SUMMARY = "Binary files of webquiz"
DESCRIPTION = "Binary files of webquiz"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn50419"

RPM_NAME = "texlive-webquiz-bin-2026.20260301.svn50419-120.4.aarch64.rpm"
RPM_HASH = "7bc3b539a4249c69a82f3f477060ebd009c79f88e155119aad659f73a15f281f01882993de199f9e11296e696222d3c82d686c2074f228e598708c224a47438d"

RPROVIDES:${PN} += "texlive-webquiz-bin"

RDEPENDS:${PN} += "texlive-webquiz"

inherit rpm
