SUMMARY = "Binary files of aleph"
DESCRIPTION = "Binary files of aleph"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-aleph-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "5f6a1d2683a7ed2567dbb5abae96d4377c0e1d77fa2f74aae906dc18671c7c6310b9494eff4a4c85489e2aefb6b7a5a217e96e77122d1404b81025d2aed1cabb"

RPROVIDES:${PN} += "texlive-aleph-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-aleph"

inherit rpm
