SUMMARY = "Binary files of fontware"
DESCRIPTION = "Binary files of fontware"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-fontware-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "adcc263a58078906882dd5aba062e473eab64799434d3d61eee66dfd1b7f86096236f769276d0237fc2bbe0cae2a4b377418946be199fae25c023eed59d27264"

RPROVIDES:${PN} += "texlive-fontware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-fontware"

inherit rpm
