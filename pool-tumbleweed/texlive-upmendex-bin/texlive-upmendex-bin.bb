SUMMARY = "Binary files of upmendex"
DESCRIPTION = "Binary files of upmendex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-upmendex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "36dbbce5ab464808190e639a71e823c3d81967f447cfe4a9a062aadd4e0365c0ec6b4b0488cea37dda146a76b585f6d2d7444b3ca0e97e880aa19f7a9c420b08"

RPROVIDES:${PN} += "texlive-upmendex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.78 \
libicuuc.so.78 \
libkpathsea.so.6 \
texlive-upmendex"

inherit rpm
