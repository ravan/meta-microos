SUMMARY = "Documentation for texlive-bigfoot"
DESCRIPTION = "This package includes the documentation for texlive-bigfoot"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-bigfoot-doc-2026.226.2.1svn77682-61.2.noarch.rpm"
RPM_HASH = "7307fa5786256384d311324720e9055e4d8911fe4a3c1f09865acb943ab18934dc33d6f77298860a86ae122d9dbe55a3ada0c8f08db09d55dac041b2cf835f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
