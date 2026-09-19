SUMMARY = "Documentation files for python-pyramid-debugtoolbar"
DESCRIPTION = "Documentation and examples for python-pyramid-debugtoolbar."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "4.12.1"

RPM_NAME = "python-pyramid-debugtoolbar-doc-4.12.1-3.5.noarch.rpm"
RPM_HASH = "ad64908ca49a4de7bb094b04b6a3d1e1acb11feb6938582838eda28fd0c1ee809d87b2748ee8fb9df2c7a479b756650d65bd45549a5fa7e2bb9fbd90b5c57fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyramid-debugtoolbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
