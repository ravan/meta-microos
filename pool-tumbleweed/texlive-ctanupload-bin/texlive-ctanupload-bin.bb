SUMMARY = "Binary files of ctanupload"
DESCRIPTION = "Binary files of ctanupload"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn23866"

RPM_NAME = "texlive-ctanupload-bin-2026.20260301.svn23866-120.4.aarch64.rpm"
RPM_HASH = "d1a571fce1cdb12d39868fed70f9b74dae4e35332e229ad8572f1f8cd3d963952999b30133e9cfa68bcc5c7f419718d6acdf07a728925eb1d00d2df41782a8a8"

RPROVIDES:${PN} += "texlive-ctanupload-bin"

RDEPENDS:${PN} += "texlive-ctanupload"

inherit rpm
