SUMMARY = "Documentation for texlive-fncylab"
DESCRIPTION = "This package includes the documentation for texlive-fncylab"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-fncylab-doc-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "a820ae5057500def44af72024833de13cef25935e9a7bc64ae7bfa3494e55457bc48d71a549871df0f2ca625cdd2be0de7d7eb644321ab8ba97142efa2587423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fncylab-doc"

RDEPENDS:${PN} += ""

inherit rpm
