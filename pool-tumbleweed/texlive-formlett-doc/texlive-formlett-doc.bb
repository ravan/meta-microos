SUMMARY = "Documentation for texlive-formlett"
DESCRIPTION = "This package includes the documentation for texlive-formlett"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3svn21480"

RPM_NAME = "texlive-formlett-doc-2026.226.2.3svn21480-60.2.noarch.rpm"
RPM_HASH = "98321f12bcbea2114e056d0b11c5a3d331cf0fe23f8112170f306d1bcec9036e9e0bd9188a5890e34ba71206cd5a363a7cbf23dc62bb7bceef135ab60c60199c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formlett-doc"

RDEPENDS:${PN} += ""

inherit rpm
