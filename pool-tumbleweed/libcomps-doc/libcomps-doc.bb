SUMMARY = "Documentation files for libcomps library"
DESCRIPTION = "Documentation files for libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.21"

RPM_NAME = "libcomps-doc-0.1.21-2.7.noarch.rpm"
RPM_HASH = "678be185fae64a82ecbb8bf411b0ef7efb77a7e88d09572df1ad7ae8bba14c938219cd05ec03fc24f14fb1eafad20419b3ba221ba27f80e595178b08067ed201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcomps-doc"

RDEPENDS:${PN} += ""

inherit rpm
