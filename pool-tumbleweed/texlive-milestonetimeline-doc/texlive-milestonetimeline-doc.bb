SUMMARY = "Documentation for texlive-milestonetimeline"
DESCRIPTION = "This package includes the documentation for texlive-milestonetimeline"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn78165"

RPM_NAME = "texlive-milestonetimeline-doc-2026.226.1.0svn78165-61.2.noarch.rpm"
RPM_HASH = "0e586218d1e1d678b363c9013acfdaed39f48666c0584af0b5d8c86008d9d6c18b3e3278af11d32f887fcf9cde48c6fe2837be0d8fdeafa9360cac2fb3c6866d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-milestonetimeline-doc"

RDEPENDS:${PN} += ""

inherit rpm
