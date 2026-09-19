SUMMARY = "Binary files of pkfix-helper"
DESCRIPTION = "Binary files of pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-pkfix-helper-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "f55042d0a46b0d49d6da78c28078eef3c7fcd30adbffd7ee1d56517b57a6b7c66d34369cf6b14151ca45bbb58983b82206f2d3c89e48f97e70ddd1d3688f5aa3"

RPROVIDES:${PN} += "texlive-pkfix-helper-bin"

RDEPENDS:${PN} += "texlive-pkfix-helper"

inherit rpm
