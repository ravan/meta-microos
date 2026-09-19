SUMMARY = "Binary files of texloganalyser"
DESCRIPTION = "Binary files of texloganalyser"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-texloganalyser-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "a3318f6d9545b0501b4f8c2e83718ae38547d0752a3072f5589825f581a8eaa56b26ec4108f7d631179fddca9fc9e9c3513903619a4da6f4b53990b57e039c12"

RPROVIDES:${PN} += "texlive-texloganalyser-bin"

RDEPENDS:${PN} += "texlive-texloganalyser"

inherit rpm
