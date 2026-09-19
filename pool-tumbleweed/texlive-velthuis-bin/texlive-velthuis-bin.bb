SUMMARY = "Binary files of velthuis"
DESCRIPTION = "Binary files of velthuis"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-velthuis-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "3064726ec6689a78bb209041c7287293d22c5f6f301af2532022918bd07cbb5b4a8766289bdac2a947b7bdb0be8c0913390044d346690b14ebb8229c2f3ab5e9"

RPROVIDES:${PN} += "texlive-velthuis-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-velthuis"

inherit rpm
