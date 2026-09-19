SUMMARY = "Documentation for texlive-envelope-letter"
DESCRIPTION = "This package includes the documentation for texlive-envelope-letter"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn76175"

RPM_NAME = "texlive-envelope-letter-doc-2026.226.1.1svn76175-61.4.noarch.rpm"
RPM_HASH = "2948a3bdd734eded710a601817ec760231c574bcb6d85ab802a57bfc8808ab0c339cfc497c3348a88ec4c452633f19df36423f812333e15b674bf8fe77c3ed43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envelope-letter-doc"

RDEPENDS:${PN} += ""

inherit rpm
