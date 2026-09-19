SUMMARY = "Binary files of optex"
DESCRIPTION = "Binary files of optex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn73828"

RPM_NAME = "texlive-optex-bin-2026.20260301.svn73828-120.4.aarch64.rpm"
RPM_HASH = "fef930d37d19cb9bbb4e57d9b4cc826ef137fb8b171501ed8e118bf6a82978c5941db9c9ec2ffb8d50955e75778adb7c78374d93416c561d475470fe2a7086b6"

RPROVIDES:${PN} += "texlive-optex-bin"

RDEPENDS:${PN} += "texlive-optex"

inherit rpm
