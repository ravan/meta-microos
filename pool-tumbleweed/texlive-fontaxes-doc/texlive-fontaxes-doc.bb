SUMMARY = "Documentation for texlive-fontaxes"
DESCRIPTION = "This package includes the documentation for texlive-fontaxes"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.2svn77682"

RPM_NAME = "texlive-fontaxes-doc-2026.226.2.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "dbedd4f4a6f056e3a8dd23b2181d1c38bb249b8dae2804db4f28deedce95027b0f97575832fa10db554190403a19109a503006ce68d4467ac0ac6df0b941755a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontaxes-doc"

RDEPENDS:${PN} += ""

inherit rpm
