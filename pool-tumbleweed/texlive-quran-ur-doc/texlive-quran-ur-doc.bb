SUMMARY = "Documentation for texlive-quran-ur"
DESCRIPTION = "This package includes the documentation for texlive-quran-ur"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23svn74829"

RPM_NAME = "texlive-quran-ur-doc-2026.226.0.0.23svn74829-60.4.noarch.rpm"
RPM_HASH = "58b6eaadbcb6cea368e262500a1e9e32d327021d4deaa7ef3c111e746ea408474b4bc5d1fd0e6b1ff7e424373f7dbdbdd0036a8b7ddab8b7356cbb6754745991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-ur-doc"

RDEPENDS:${PN} += ""

inherit rpm
