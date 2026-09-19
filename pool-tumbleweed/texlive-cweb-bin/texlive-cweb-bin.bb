SUMMARY = "Binary files of cweb"
DESCRIPTION = "Binary files of cweb"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-cweb-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "fc380e74564ddbfe1053dee5b0966c73f7286f411dcb848d272c3c4f62c17793d7df5f0ebe8597b55b39ebf8fde49ff01d1c96ebacfdf5a6fa1bfc1d687b213f"

RPROVIDES:${PN} += "texlive-cweb-bin"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cweb"

inherit rpm
