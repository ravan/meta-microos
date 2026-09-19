SUMMARY = "Binary files of mkjobtexmf"
DESCRIPTION = "Binary files of mkjobtexmf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn8457"

RPM_NAME = "texlive-mkjobtexmf-bin-2026.20260301.svn8457-120.4.aarch64.rpm"
RPM_HASH = "1f1f4356a386a5b31cc0e6f9a9995682e2ab4c3cb2dce5b99b58dd41b679ec074556a66368398a9ee1477c857a69d5517b8f03c35891aa8f6adcc9303d70ea6a"

RPROVIDES:${PN} += "texlive-mkjobtexmf-bin"

RDEPENDS:${PN} += "texlive-mkjobtexmf"

inherit rpm
