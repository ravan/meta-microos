SUMMARY = "Binary files of musixtex"
DESCRIPTION = "Binary files of musixtex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37026"

RPM_NAME = "texlive-musixtex-bin-2026.20260301.svn37026-120.4.aarch64.rpm"
RPM_HASH = "91c67ccbd60b9d736e8a3095af4eaed93ae528ace5fc42dcd617a36ce3c7342993df9c29db8367baf4ec21da9c54d7649035fa55bbae7a0d815b22a58b99d9fa"

RPROVIDES:${PN} += "texlive-musixtex-bin"

RDEPENDS:${PN} += "texlive-m-tx-bin \
texlive-musixtex \
texlive-pmx-bin"

inherit rpm
