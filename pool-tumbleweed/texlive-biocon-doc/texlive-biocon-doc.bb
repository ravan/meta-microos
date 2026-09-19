SUMMARY = "Documentation for texlive-biocon"
DESCRIPTION = "This package includes the documentation for texlive-biocon"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-biocon-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "8ebcd04ddcc77dfe74dc0f07b669c3bdbb50c385d18815945b35f491f511bbdad8b11132d2de1c9ae47a4b4a5180be839a31d28eed953962bde0bafea5c6eb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biocon-doc"

RDEPENDS:${PN} += ""

inherit rpm
