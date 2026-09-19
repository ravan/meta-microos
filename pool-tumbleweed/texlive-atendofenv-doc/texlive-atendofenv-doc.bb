SUMMARY = "Documentation for texlive-atendofenv"
DESCRIPTION = "This package includes the documentation for texlive-atendofenv"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn62164"

RPM_NAME = "texlive-atendofenv-doc-2026.226.0.0.2svn62164-60.2.noarch.rpm"
RPM_HASH = "111f1440efaf36fad333e441c531928d234fe9cac1abe3844a10ee33dbf99f4b6ccbeeb7d0964eaa41a57a558cf01440a65dc639f01b777d0f3a775dbf1eb9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atendofenv-doc"

RDEPENDS:${PN} += ""

inherit rpm
