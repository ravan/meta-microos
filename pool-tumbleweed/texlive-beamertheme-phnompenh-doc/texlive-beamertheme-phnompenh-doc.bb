SUMMARY = "Documentation for texlive-beamertheme-phnompenh"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-phnompenh"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn39100"

RPM_NAME = "texlive-beamertheme-phnompenh-doc-2026.226.1.0svn39100-61.2.noarch.rpm"
RPM_HASH = "cf4338fd14096b1b549d88eed9b75758fed39a32ad1b1ba226fc804b5b9d28e7dc908181d47e2ac27f53d0607d24fcf824c7aeb63b4a765d59092a2b7ead41b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-phnompenh-doc"

RDEPENDS:${PN} += ""

inherit rpm
