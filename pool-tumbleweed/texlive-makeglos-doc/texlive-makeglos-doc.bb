SUMMARY = "Documentation for texlive-makeglos"
DESCRIPTION = "This package includes the documentation for texlive-makeglos"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-makeglos-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "33acf106b0ca051ce6452b05d3418e5bee3883012f3dca08fdf7170e43e70c87f819beb835f25c21b7f5410887bfcc672aa6a4e9b46a1c91e5c5a6f8dd6f84ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeglos-doc"

RDEPENDS:${PN} += ""

inherit rpm
