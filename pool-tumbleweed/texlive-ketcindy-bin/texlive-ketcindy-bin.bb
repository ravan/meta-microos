SUMMARY = "Binary files of ketcindy"
DESCRIPTION = "Binary files of ketcindy"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn49033"

RPM_NAME = "texlive-ketcindy-bin-2026.20260301.svn49033-120.4.aarch64.rpm"
RPM_HASH = "9a03653f027c2063c7478fe2bd93b731fe93f1b013a06ca6dc2068a92c6949a4cae19a30bb931944ced2073d1243304478691c652f648f3e3fc52ae3d2932b6b"

RPROVIDES:${PN} += "texlive-ketcindy-bin"

RDEPENDS:${PN} += "texlive-ketcindy"

inherit rpm
