SUMMARY = "Binary files of chktex"
DESCRIPTION = "Binary files of chktex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-chktex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "de99725629fff5d72559a051c021a68e73d5c44ccd1401cbb9ba01f4d1df3473add6c1f128e660e09b02a15e68a0527311b6b1623e20190686397e626759560a"

RPROVIDES:${PN} += "texlive-chktex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-chktex"

inherit rpm
