SUMMARY = "Binary files of tie"
DESCRIPTION = "Binary files of tie"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-tie-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "d752b84aa0118c744c9654698ace7f34e95d00ed21a69a472939f25585c995dc8927e0b3b0957ee55ddc9b93bd64aa4c01b22818365f0fd3248d6fc151982544"

RPROVIDES:${PN} += "texlive-tie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-tie"

inherit rpm
