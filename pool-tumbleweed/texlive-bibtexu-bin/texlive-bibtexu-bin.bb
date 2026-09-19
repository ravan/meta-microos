SUMMARY = "Binary files of bibtexu"
DESCRIPTION = "Binary files of bibtexu"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-bibtexu-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "cdeb76c315a705c9f858f98801b2d699a10fef5ef0468908d45d917788debf18ac33f23aca1835e0d4f647f0e6ae8e64d85f56d847358e386a5fb820e850a421"

RPROVIDES:${PN} += "texlive-bibtexu-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.78 \
libicuuc.so.78 \
libkpathsea.so.6 \
texlive-bibtexu"

inherit rpm
