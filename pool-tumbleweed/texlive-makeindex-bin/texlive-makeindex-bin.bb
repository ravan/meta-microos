SUMMARY = "Binary files of makeindex"
DESCRIPTION = "Binary files of makeindex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-makeindex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "2d2d435578404f8249bf258febfdb1c489a58d6f2b54eebc93cf9ff210d73f95d1eeef3bc6bd51c3a578c94ba145cc2b7b6b289cb37b8f68e7e67dc19bb47107"

RPROVIDES:${PN} += "texlive-makeindex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-makeindex"

inherit rpm
