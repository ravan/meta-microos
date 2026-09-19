SUMMARY = "Documentation for texlive-mnhyphn"
DESCRIPTION = "This package includes the documentation for texlive-mnhyphn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn69727"

RPM_NAME = "texlive-mnhyphn-doc-2026.226.1.4svn69727-61.2.noarch.rpm"
RPM_HASH = "8f11aa0fd590a88e0c042b112161386ee12901bc09a4a69102ea1b1817af1a3587e0c059f6acfb611ac00f577d63aecac364e86c5d89afc2ff585d2755977be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnhyphn-doc"

RDEPENDS:${PN} += ""

inherit rpm
