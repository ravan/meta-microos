SUMMARY = "Documentation for texlive-modernruler"
DESCRIPTION = "This package includes the documentation for texlive-modernruler"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.6svn77699"

RPM_NAME = "texlive-modernruler-doc-2026.226.2.1.6svn77699-61.2.noarch.rpm"
RPM_HASH = "7c9e4f6f894b7f1809077497371b281e1229f6a7062dac3c1b11c39738503e9b87cd96cec10610ea0d92063d0a4f7f706d9e48f707331e06edb1d8465c1e16ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modernruler-doc"

RDEPENDS:${PN} += ""

inherit rpm
