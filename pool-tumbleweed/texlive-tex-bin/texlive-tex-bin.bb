SUMMARY = "Binary files of tex"
DESCRIPTION = "Binary files of tex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-tex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "48e99edecfe30be6cddec8b6777c0abe2427f79d9d9ae1cd6226dcb6710c51380f91d8b275cd9efd53b0119561d1d4546c98be9edb2413cf9145f25d0de4200a"

RPROVIDES:${PN} += "texlive-tex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex"

inherit rpm
