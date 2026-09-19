SUMMARY = "Binary files of texlive-scripts"
DESCRIPTION = "Binary files of texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn64356"

RPM_NAME = "texlive-scripts-bin-2026.20260301.svn64356-120.4.aarch64.rpm"
RPM_HASH = "0e8f7ae6008adbf9e74be7b45df4086604ecb5b562362d6bd0396c4aa34764ade1c19bba5a8884854e58a6b596af53f37e19e9589ca4a265f7a117dca7ef3b9f"

RPROVIDES:${PN} += "texlive-scripts-bin"

RDEPENDS:${PN} += "texlive-scripts"

inherit rpm
