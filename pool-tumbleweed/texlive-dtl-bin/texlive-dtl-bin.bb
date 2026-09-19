SUMMARY = "Binary files of dtl"
DESCRIPTION = "Binary files of dtl"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dtl-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "082479c03bf5f1c8f827ef563035bbf7b90b3dccee603d5c54d9b6b33df091a493b3799a46b1e5c4e8b95e822877937f76b1cea635a6e30a04b961852ac16513"

RPROVIDES:${PN} += "texlive-dtl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dtl"

inherit rpm
