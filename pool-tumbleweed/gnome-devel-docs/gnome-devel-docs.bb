SUMMARY = "GNOME Platform Documentation"
DESCRIPTION = "This package contains documents that are useful for GNOME developers."
LICENSE = "CC-BY-SA-4.0 & GFDL-1.1-only"

PV = "40.3"

RPM_NAME = "gnome-devel-docs-40.3-1.15.noarch.rpm"
RPM_HASH = "993b820feca6d5448c94ff9554d076305ba761f19f4a5052f6bd2f7bc10e7bc75fda42be66736e181da9efe444d790d087c8179c307433ca1bde4c9ab176e437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-devel-docs"

RDEPENDS:${PN} += ""

inherit rpm
