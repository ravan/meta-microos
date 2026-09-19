SUMMARY = "Binary files of ptex2pdf"
DESCRIPTION = "Binary files of ptex2pdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29335"

RPM_NAME = "texlive-ptex2pdf-bin-2026.20260301.svn29335-120.4.aarch64.rpm"
RPM_HASH = "1883e8bd3b4c1ad7a48c114a7e87c8556b9457120cfca9fcc6b571f362ea243d43da1ebdbf38df1b430b812f66c2175aeceee074618e685823e3cf718bf6164c"

RPROVIDES:${PN} += "texlive-ptex2pdf-bin"

RDEPENDS:${PN} += "texlive-ptex2pdf"

inherit rpm
