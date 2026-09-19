SUMMARY = "Documentation for texlive-childdoc"
DESCRIPTION = "This package includes the documentation for texlive-childdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn74758"

RPM_NAME = "texlive-childdoc-doc-2026.226.2.0.1svn74758-60.2.noarch.rpm"
RPM_HASH = "a29db113a51dd6c8dbd611cd911b1c086b5354da9cbcc58afe6d4250e10abce0542d66d1cb69c3aede399d8ab1b00885e2abf0cf514090d07a16e807d209522c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-childdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
