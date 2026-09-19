SUMMARY = "Binary files of bibtex"
DESCRIPTION = "Binary files of bibtex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-bibtex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "e3196b85926d4624329aae19961b9a8a21a252ace1a706b107650925c156a4a0fd7bb6c62ad6b81cda71834606c82971b920645911ddf9d678ef6398e741528f"

RPROVIDES:${PN} += "texlive-bibtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex"

inherit rpm
