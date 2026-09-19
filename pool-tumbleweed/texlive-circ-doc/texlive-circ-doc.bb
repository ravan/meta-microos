SUMMARY = "Documentation for texlive-circ"
DESCRIPTION = "This package includes the documentation for texlive-circ"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn62977"

RPM_NAME = "texlive-circ-doc-2026.226.1.1svn62977-60.2.noarch.rpm"
RPM_HASH = "3755cda16a3e009fe955c46a9a08610a372237e58d686b1f6a29000ee91d2892bab4327fc5a5b48054742250b7095152e843824855436b7987bd89cb13c4ab5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circ-doc"

RDEPENDS:${PN} += ""

inherit rpm
