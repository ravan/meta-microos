SUMMARY = "Binary files of texdoctk"
DESCRIPTION = "Binary files of texdoctk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29741"

RPM_NAME = "texlive-texdoctk-bin-2026.20260301.svn29741-120.4.aarch64.rpm"
RPM_HASH = "e898084499384457fa66d1b48158a79f4ed2b89d210046cc42247f46bd05feb87d931233d3212df71eef6ca3eb559d24c431daa094e1c126b1994bf710a8aaf9"

RPROVIDES:${PN} += "texlive-texdoctk-bin"

RDEPENDS:${PN} += "texlive-texdoctk"

inherit rpm
