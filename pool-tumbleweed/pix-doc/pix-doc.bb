SUMMARY = "Documentation for pix"
DESCRIPTION = "This package offers you extended HTML documentation for pix"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "pix-doc-3.4.7-1.8.noarch.rpm"
RPM_HASH = "aa22ae5e842ddc9030aec521ceb3c07b8b64cb05dd1f3d6208759f5a2d2ac896cc3a8508030f1d45cacfd09ecea411988e38428ae0bdba7e180dafda09d1d86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pix-doc"

RDEPENDS:${PN} += ""

inherit rpm
