SUMMARY = "Binary files of mfware"
DESCRIPTION = "Binary files of mfware"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-mfware-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "3e3eab1427e05c2e99cf364dbd635405ad28157bffc2189940cf305a2f111f23195c8693a6db801afb6ad2c35b367cc12b755e40c4f56580850f201e19da7523"

RPROVIDES:${PN} += "texlive-mfware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-mfware"

inherit rpm
