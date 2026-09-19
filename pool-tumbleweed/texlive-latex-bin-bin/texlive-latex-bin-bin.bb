SUMMARY = "Binary files of latex-bin"
DESCRIPTION = "Binary files of latex-bin"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn54358"

RPM_NAME = "texlive-latex-bin-bin-2026.20260301.svn54358-120.4.aarch64.rpm"
RPM_HASH = "534d503027ba624b9c44f2c5466f453a000d262f7d9cc5866ff21e2a0599c4e0433bb57143cfbcd13d3a3bb43ee389db37f8741eaccb26b5ab9671b901a48721"

RPROVIDES:${PN} += "texlive-latex-bin-bin"

RDEPENDS:${PN} += "libz1 \
texlive-latex-bin"

inherit rpm
