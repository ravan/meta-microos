SUMMARY = "Binary files of typog"
DESCRIPTION = "Binary files of typog"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn71202"

RPM_NAME = "texlive-typog-bin-2026.20260301.svn71202-120.4.aarch64.rpm"
RPM_HASH = "dcf68ed1a4bb6c7aee2f99456d9fd0af2138ccf099df1fc542747144edd292c027165a1e3e0437c6df6a668ced8e0ba8d7d3d2c78ed42e9875a7671c382c91e9"

RPROVIDES:${PN} += "texlive-typog-bin"

RDEPENDS:${PN} += "texlive-typog"

inherit rpm
