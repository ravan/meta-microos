SUMMARY = "Binary files of dosepsbin"
DESCRIPTION = "Binary files of dosepsbin"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn24759"

RPM_NAME = "texlive-dosepsbin-bin-2026.20260301.svn24759-120.4.aarch64.rpm"
RPM_HASH = "a759a003d0489166aa0c1cf902169e425f56b447a6af986626dfcf0d59705c8b21e15a5d5549522ff60cbb8cab047d93dc997502dbd30dfb87821c54d7e959bd"

RPROVIDES:${PN} += "texlive-dosepsbin-bin"

RDEPENDS:${PN} += "texlive-dosepsbin"

inherit rpm
