SUMMARY = "Documentation for OpenStack oslo.rootwrap"
DESCRIPTION = "Documentation for the OpenStack oslo.rootwrap library."
LICENSE = "Apache-2.0"

PV = "7.10.0"

RPM_NAME = "python-oslo.rootwrap-doc-7.10.0-1.1.noarch.rpm"
RPM_HASH = "aec1eeb1de915ce9fb9b83fed1f18716f038b914e4999c594fe97f2d3bf1dd6944f00df5de9708f7ce25aae1ec96699cabf4d6bbd5a04152006ca4056808090d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.rootwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
