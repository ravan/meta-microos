SUMMARY = "Documentation for texlive-eledmac"
DESCRIPTION = "This package includes the documentation for texlive-eledmac"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-doc-2026.226.1.24.12svn45418-61.4.noarch.rpm"
RPM_HASH = "4045cf101df1d61240ef952550d475b5a6b15a692214ade8010e8f43aa6e632beda3a57c6e81437d673c15a92eb60f9e08438c57dd18dcaf6831b5bd90996869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
