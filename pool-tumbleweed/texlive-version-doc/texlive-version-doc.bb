SUMMARY = "Documentation for texlive-version"
DESCRIPTION = "This package includes the documentation for texlive-version"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-version-doc-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "4693f5e47814992e6d1ea358bdb0de8ddb4b22d8f1f5aeb4db0ecbeb76fab5597b9e26b015f2b04ff2d40f2860085d9bf39ed8915d33bb3a090e6f416d4a9788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-version-doc"

RDEPENDS:${PN} += ""

inherit rpm
