SUMMARY = "Binary files of mf2pt1"
DESCRIPTION = "Binary files of mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn23406"

RPM_NAME = "texlive-mf2pt1-bin-2026.20260301.svn23406-120.4.aarch64.rpm"
RPM_HASH = "91f84ae67ff5e9ad0413b43bf2e4eba0a1b7fc2c0de7444ea0d45308cef2d8a819137fcae1afcd9a0d056d525908ea7f937e1858de2e368c2f822683d67cbdec"

RPROVIDES:${PN} += "texlive-mf2pt1-bin"

RDEPENDS:${PN} += "texlive-mf2pt1"

inherit rpm
