SUMMARY = "Documentation for texlive-aurical"
DESCRIPTION = "This package includes the documentation for texlive-aurical"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-aurical-doc-2026.226.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "56d6ebf7aaac5790269dc5d72cfa9fbfda438c39ee1826a480cc535349b861f646483d68f9db3b3bc3868182278c3f236afdff5a9281ab5be372d4280d7cfddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aurical-doc"

RDEPENDS:${PN} += ""

inherit rpm
