SUMMARY = "Binary files of ctie"
DESCRIPTION = "Binary files of ctie"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-ctie-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "375d044c694f69482d836ac1579f21ace1a0286e5e8ce0a6c5345f153eb7190077c3b33a70652646e6aefb15716ac76f21e34f923ab8aedd2bb36a2f7f677ced"

RPROVIDES:${PN} += "texlive-ctie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-ctie"

inherit rpm
