SUMMARY = "Binary files of detex"
DESCRIPTION = "Binary files of detex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-detex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "6c5d63247b93e6e560a3fe8aee7d63e3072814385bfc1f0067cdd5c3ca5eb2ceb6f479885128d19abb07a15a40a3f49fb92bbc7e7a35c7124d3539a26a32f1f4"

RPROVIDES:${PN} += "texlive-detex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-detex"

inherit rpm
