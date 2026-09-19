SUMMARY = "Binary files of csplain"
DESCRIPTION = "Binary files of csplain"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn50528"

RPM_NAME = "texlive-csplain-bin-2026.20260301.svn50528-120.4.aarch64.rpm"
RPM_HASH = "dfc48796e6da956fc7ae1b245cbce29f5157d232af610e85febd4715339835c6e9976deda31e0f23026b540af71802585e9f123ae1652905e5a6fce935e3e6bc"

RPROVIDES:${PN} += "texlive-csplain-bin"

RDEPENDS:${PN} += "texlive-csplain"

inherit rpm
