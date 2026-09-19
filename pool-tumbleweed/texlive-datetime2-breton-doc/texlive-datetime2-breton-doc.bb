SUMMARY = "Documentation for texlive-datetime2-breton"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-breton"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn52647"

RPM_NAME = "texlive-datetime2-breton-doc-2026.226.1.2svn52647-59.2.noarch.rpm"
RPM_HASH = "09a2be12aac3018bfca2b9c0bb2263165e009e16bbfa9911faa4d35d673d2e3cede067ab05e67177daf29edd1fc089db7bb28ce91bd5a9c41036e480fda81a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-breton-doc"

RDEPENDS:${PN} += ""

inherit rpm
