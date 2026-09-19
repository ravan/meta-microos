SUMMARY = "Documentation for texlive-doipubmed"
DESCRIPTION = "This package includes the documentation for texlive-doipubmed"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-doipubmed-doc-2026.226.1.01svn15878-59.2.noarch.rpm"
RPM_HASH = "b633d28d4849754b06185d041f2fbb31a30479ea8b6fb94caee1dd574a63d7e40e33b65c4989b86bf43ad421f9b84174df71a2781e431c08fec4231795514777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doipubmed-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
