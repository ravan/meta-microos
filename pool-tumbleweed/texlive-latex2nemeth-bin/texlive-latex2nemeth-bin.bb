SUMMARY = "Binary files of latex2nemeth"
DESCRIPTION = "Binary files of latex2nemeth"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn42300"

RPM_NAME = "texlive-latex2nemeth-bin-2026.20260301.svn42300-120.4.aarch64.rpm"
RPM_HASH = "45b3514bd7ecd8867c6d3871ddf7afd0ebcf532cff03f42f8c09f69161d94b201ccf3ec278f913f9f628434360a08021245d86abe8e637073fef7fd4d8b4f276"

RPROVIDES:${PN} += "texlive-latex2nemeth-bin"

RDEPENDS:${PN} += "texlive-latex2nemeth"

inherit rpm
