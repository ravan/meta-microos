SUMMARY = "Documentation for texlive-pst-fourbarlinkage"
DESCRIPTION = "This package includes the documentation for texlive-pst-fourbarlinkage"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77161"

RPM_NAME = "texlive-pst-fourbarlinkage-doc-2026.226.0.0.01svn77161-59.2.noarch.rpm"
RPM_HASH = "9643ffe53d206da9056afb38c06497d5a887a3fd4aaaa163eed812833bb31eafb1274ad5af29d46f2c843468f449af2dff82dce9a5fb4848b6084b542e91bb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fourbarlinkage-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
