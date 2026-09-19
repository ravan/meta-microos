SUMMARY = "Binary files of musixtnt"
DESCRIPTION = "Binary files of musixtnt"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-musixtnt-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "823de467c11882ee64695981cf91f4cda8ee4a87ce10d46178f757708c4f8027cdd19f1a398f9eced925ea73bb3a071c9c58ef86950334fe0475a4e9f25ed75a"

RPROVIDES:${PN} += "texlive-musixtnt-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-musixtnt"

inherit rpm
