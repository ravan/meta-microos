SUMMARY = "Binary files of gsftopk"
DESCRIPTION = "Binary files of gsftopk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-gsftopk-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "ccb7d87a9fe5ab641bf82dba382d5494c9c08472d1c1923d8a5e8a82fb7d032b4e0ceb87d40d5b988ca413b971f679c1a8e138c639595325efe5e2f482672e68"

RPROVIDES:${PN} += "texlive-gsftopk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gsftopk"

inherit rpm
