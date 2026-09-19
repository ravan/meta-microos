SUMMARY = "Documentation files for gxml"
DESCRIPTION = "Documentation files for gxml."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.4"

RPM_NAME = "gxml-doc-0.20.4-2.7.noarch.rpm"
RPM_HASH = "df82fc60c0afbd4fc8fde4c30d4de59603f49b47f622897f817ea2d97f8cf5d8511db42e570dae6f8d639494e255155952fe8192a75efa88df285c3f84828b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
