SUMMARY = "Documentation CGAL algorithms"
DESCRIPTION = "This package provides the documentation for CGAL algorithms."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "cgal-doc-6.2.1-1.1.noarch.rpm"
RPM_HASH = "e7f96ea9f84d756d5e46214da9e04a75a70e99427ee210c70736144feef88139196da7b700a8be54f249cc63e7d3672e704424620afe29295a09488135778047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cgal-doc"

RDEPENDS:${PN} += ""

inherit rpm
