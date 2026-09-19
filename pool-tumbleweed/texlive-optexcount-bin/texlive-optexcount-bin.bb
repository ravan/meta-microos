SUMMARY = "Binary files of optexcount"
DESCRIPTION = "Binary files of optexcount"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn59817"

RPM_NAME = "texlive-optexcount-bin-2026.20260301.svn59817-120.4.aarch64.rpm"
RPM_HASH = "0a5646178bec487e29ea2a01136745ed184dae0b2fe62bb13e5e673163e047ed9517d692223cc585249e29129e3d80d5b48a3b88a06852eca682a08726ae8e12"

RPROVIDES:${PN} += "texlive-optexcount-bin"

RDEPENDS:${PN} += "texlive-optexcount"

inherit rpm
