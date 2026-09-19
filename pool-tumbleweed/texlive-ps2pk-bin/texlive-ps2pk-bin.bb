SUMMARY = "Binary files of ps2pk"
DESCRIPTION = "Binary files of ps2pk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-ps2pk-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "76a85e8a13b5f7c7d1a20fa187797d031b74999a7dc1a91cb625bf71b9112df8e1b82252e58024e61154f93240e53336f049aa7a9d984795b5a4485127b7bac2"

RPROVIDES:${PN} += "texlive-ps2pk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ps2pk"

inherit rpm
