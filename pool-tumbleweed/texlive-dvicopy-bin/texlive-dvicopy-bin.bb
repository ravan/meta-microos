SUMMARY = "Binary files of dvicopy"
DESCRIPTION = "Binary files of dvicopy"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dvicopy-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "2ab8e6d8e9c2e5f0753678b9af27c19a8205345769a3530dc5f9384213c1dbe99345964c668207eb0e8a8366a18b89dca21e41e44d31b6acd8ba0a90fe04f547"

RPROVIDES:${PN} += "texlive-dvicopy-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvicopy"

inherit rpm
