SUMMARY = "Binary files of l3build"
DESCRIPTION = "Binary files of l3build"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn46894"

RPM_NAME = "texlive-l3build-bin-2026.20260301.svn46894-120.4.aarch64.rpm"
RPM_HASH = "9fedbfb5928cc4cbfd1c3159c6e13476851af7b965565e6b861b494056d543f89728811e49b1c333c73a4f6c2be4804c697eddf8fb280a0087d611b84f48a431"

RPROVIDES:${PN} += "texlive-l3build-bin"

RDEPENDS:${PN} += "texlive-l3build"

inherit rpm
