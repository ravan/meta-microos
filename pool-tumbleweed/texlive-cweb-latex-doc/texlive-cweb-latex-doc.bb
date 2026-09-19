SUMMARY = "Documentation for texlive-cweb-latex"
DESCRIPTION = "This package includes the documentation for texlive-cweb-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn28878"

RPM_NAME = "texlive-cweb-latex-doc-2026.226.svn28878-61.2.noarch.rpm"
RPM_HASH = "c4c4b182dd38d384560f4d826d7061b1953fe947b838134c040db388a2e838e7aaeb79174207a6b83030a07f36a7a2bd8e40a4608254a370415121f86c335b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cweb-latex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
