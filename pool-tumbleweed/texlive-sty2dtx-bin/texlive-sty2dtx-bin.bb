SUMMARY = "Binary files of sty2dtx"
DESCRIPTION = "Binary files of sty2dtx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn21215"

RPM_NAME = "texlive-sty2dtx-bin-2026.20260301.svn21215-120.4.aarch64.rpm"
RPM_HASH = "6baa8471c77380a64b01c77cfe63eb9aaa01ab686847dc947d0c22011f72fa9eb672fafb6b34bbe598cbddb8091bae973a4d3af5662d2b2b4bd2060d7e0a3b51"

RPROVIDES:${PN} += "texlive-sty2dtx-bin"

RDEPENDS:${PN} += "texlive-sty2dtx"

inherit rpm
