SUMMARY = "Binary files of epspdf"
DESCRIPTION = "Binary files of epspdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29050"

RPM_NAME = "texlive-epspdf-bin-2026.20260301.svn29050-120.4.aarch64.rpm"
RPM_HASH = "c769bb8ed5e26ba8a34e3d96858e1c38426f816b77d99ee4db1a34c327e3f981e08f0007b20beb20a653660580d4ce02934c5f7a111cfbedeff3fa6edde47df1"

RPROVIDES:${PN} += "texlive-epspdf-bin"

RDEPENDS:${PN} += "texlive-epspdf"

inherit rpm
