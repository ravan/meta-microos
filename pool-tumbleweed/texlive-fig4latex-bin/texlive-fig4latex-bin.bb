SUMMARY = "Binary files of fig4latex"
DESCRIPTION = "Binary files of fig4latex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn14752"

RPM_NAME = "texlive-fig4latex-bin-2026.20260301.svn14752-120.4.aarch64.rpm"
RPM_HASH = "136a8ddf4b8686702d721d1cbe48929394d06da8ccaf4404fdfa1090e14277937d58b37a966a71feafa114aeae6122ce298cc118b38022d0907767579177f9cc"

RPROVIDES:${PN} += "texlive-fig4latex-bin"

RDEPENDS:${PN} += "texlive-fig4latex"

inherit rpm
