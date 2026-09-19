SUMMARY = "Documentation for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "This package includes the documentation for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-doc-2026.226.1.1svn55213-60.4.noarch.rpm"
RPM_HASH = "c32c0064ea3446c6aca98b6b304e6d03fa8d540859c463d401e115f796ed7ba75b828607dc9dd29c8caa836a92ee92718c97016bb21b2bb7cd7096657ac840d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-doc"

RDEPENDS:${PN} += ""

inherit rpm
