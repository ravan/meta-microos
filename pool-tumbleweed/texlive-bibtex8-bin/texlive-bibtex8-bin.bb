SUMMARY = "Binary files of bibtex8"
DESCRIPTION = "Binary files of bibtex8"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-bibtex8-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "7db22242e7408ed8d50e62844dbbc2ea9d9ccd4b07d10dad246c760a415503d66f67a1c487f400450d5c5ec754159ad836bbf7ae3e959efb54be864f859b754d"

RPROVIDES:${PN} += "texlive-bibtex8-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex8"

inherit rpm
