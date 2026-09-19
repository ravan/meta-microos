SUMMARY = "Binary files of texlogsieve"
DESCRIPTION = "Binary files of texlogsieve"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn61328"

RPM_NAME = "texlive-texlogsieve-bin-2026.20260301.svn61328-120.4.aarch64.rpm"
RPM_HASH = "dad9623d9d6b7b13470688a320e360930103eece3d34ae7f4e3a36bd301ecc76dd969185abe174984aabb00405b08ddaf98021080d5c65eec92209d3b9419793"

RPROVIDES:${PN} += "texlive-texlogsieve-bin"

RDEPENDS:${PN} += "texlive-texlogsieve"

inherit rpm
