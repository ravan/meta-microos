SUMMARY = "Documentation for texlive-xcharter"
DESCRIPTION = "This package includes the documentation for texlive-xcharter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.26svn71564"

RPM_NAME = "texlive-xcharter-doc-2026.226.1.26svn71564-59.4.noarch.rpm"
RPM_HASH = "cc130ce9880967ec3fd5415d9533acbe3c4630216d4e1ca8157a23c0c31eb275ee809124979c7ec0cacd63b033e1ff1f22a363c2099bfd5cab24213aa3bff301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
