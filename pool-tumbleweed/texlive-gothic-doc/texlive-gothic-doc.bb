SUMMARY = "Documentation for texlive-gothic"
DESCRIPTION = "This package includes the documentation for texlive-gothic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49869"

RPM_NAME = "texlive-gothic-doc-2026.226.svn49869-60.4.noarch.rpm"
RPM_HASH = "f8dccc0546cd6917b513b25e4a8a6c59eeb4b54bc4b250f74cc6b8bd361b7a8cac0dbcd93aa7e96405bbddd420f78111bcffc29182edbfac4122f735a243bea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gothic-doc"

RDEPENDS:${PN} += ""

inherit rpm
