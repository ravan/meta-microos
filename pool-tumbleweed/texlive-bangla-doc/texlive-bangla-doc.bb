SUMMARY = "Documentation for texlive-bangla"
DESCRIPTION = "This package includes the documentation for texlive-bangla"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76924"

RPM_NAME = "texlive-bangla-doc-2026.226.2.1svn76924-60.2.noarch.rpm"
RPM_HASH = "221f2e06c2aca03229a57fcaf521fa12f0ba48d5d7741a717a92f5db4efa7fecf5c759ad60a4b9a1f2fb070f33f899fc75f07f348d5093d7fac2bc1e810594cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangla-doc"

RDEPENDS:${PN} += ""

inherit rpm
