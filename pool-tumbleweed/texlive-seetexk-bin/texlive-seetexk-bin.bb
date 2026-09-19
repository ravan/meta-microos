SUMMARY = "Binary files of seetexk"
DESCRIPTION = "Binary files of seetexk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-seetexk-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "f1e8e05a84a1ad3b48522d797c0aafe468d15d97558f9324363c4316c22347f7dc67e48235f3fada3326fa4b8d0bcf3b9323a1e0da50b8bbcc76bc4329ba7cfa"

RPROVIDES:${PN} += "texlive-seetexk-bin"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-seetexk"

inherit rpm
