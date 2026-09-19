SUMMARY = "Binary files of ctan-o-mat"
DESCRIPTION = "Binary files of ctan-o-mat"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn46996"

RPM_NAME = "texlive-ctan-o-mat-bin-2026.20260301.svn46996-120.4.aarch64.rpm"
RPM_HASH = "be058a708a7b2a90cb47fd32f513fec00779166a3a360a164be60b634c56668ab4cdc573bfebd05d7737120d02370971a8d1645edd98b77fc60e4e3a1e079b0b"

RPROVIDES:${PN} += "texlive-ctan-o-mat-bin"

RDEPENDS:${PN} += "texlive-ctan-o-mat"

inherit rpm
