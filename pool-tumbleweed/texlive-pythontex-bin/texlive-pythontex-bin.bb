SUMMARY = "Binary files of pythontex"
DESCRIPTION = "Binary files of pythontex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn31638"

RPM_NAME = "texlive-pythontex-bin-2026.20260301.svn31638-120.4.aarch64.rpm"
RPM_HASH = "93254ee2c6dedd2557169816c194678c4aba1ee1ed919a7e7a66fdf3aa83cbf628b36d6fed5965568fd006325ae4e6633d74c67a5dce894bcf34fa78fd6e7ed4"

RPROVIDES:${PN} += "texlive-pythontex-bin"

RDEPENDS:${PN} += "texlive-pythontex"

inherit rpm
