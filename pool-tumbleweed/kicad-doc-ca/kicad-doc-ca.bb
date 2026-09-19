SUMMARY = "Catalan documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Catalan documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-ca-10.0.6-1.1.noarch.rpm"
RPM_HASH = "3cc8053ba6bad58d9f1f93fbdcbd7e5e9391d57037e14def212101c006ba81f8ffba2964e3d3608303fa6595a7b1d5425e979e72e794d906b89b43ca8b96278a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ca \
locale-kicad-doc-ca"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
