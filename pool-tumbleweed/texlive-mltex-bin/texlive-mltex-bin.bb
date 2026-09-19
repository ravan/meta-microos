SUMMARY = "Binary files of mltex"
DESCRIPTION = "Binary files of mltex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-mltex-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "b5ce56548317deca767cca6fc0ed2ebf9c96720b1cba506ab1691ced6a9bf9da315580173d251d4282fcc70b4727bbffb972f33cef37d2ced508642d7ba2d476"

RPROVIDES:${PN} += "texlive-mltex-bin"

RDEPENDS:${PN} += "texlive-mltex"

inherit rpm
