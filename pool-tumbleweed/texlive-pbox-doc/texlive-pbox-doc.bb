SUMMARY = "Documentation for texlive-pbox"
DESCRIPTION = "This package includes the documentation for texlive-pbox"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-pbox-doc-2026.226.1.2svn77682-58.2.noarch.rpm"
RPM_HASH = "cb659be0558b5fa3378cc270298a2e6f34d2dfc824580154851637cf775d1828c51e971e727ba87b75deb0d8e23376bbb6f3932f0c030923f742be2fef019b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
