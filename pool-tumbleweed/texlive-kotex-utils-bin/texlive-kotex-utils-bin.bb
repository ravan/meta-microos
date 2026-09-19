SUMMARY = "Binary files of kotex-utils"
DESCRIPTION = "Binary files of kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn32101"

RPM_NAME = "texlive-kotex-utils-bin-2026.20260301.svn32101-120.4.aarch64.rpm"
RPM_HASH = "ae5f0e80c68f1f2211aa19b2d4864b49e99d7c2431247e50cc93aee483434a69f9c791e6399c004a40761cb472a848aeba7f8fb12b59c882d7b2cab60660a34d"

RPROVIDES:${PN} += "texlive-kotex-utils-bin"

RDEPENDS:${PN} += "texlive-kotex-utils"

inherit rpm
