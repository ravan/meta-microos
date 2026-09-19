SUMMARY = "Product Composer Base Images (skeleton data)"
DESCRIPTION = "Loaders that can be extracted in ftp-trees."
LICENSE = "SUSE-EULA"

PV = "24.0.0"

RPM_NAME = "skelcd-agama-installer-openSUSE-24.0.0-2.14.aarch64.rpm"
RPM_HASH = "5f3a17cb69dd94f55203e055e6549eeb9d2e93ebbdb226378f18787ff461385a38857201d35632cf23ea6aa2fc4960a07a05b9977e3fd15b315fdc9d55f9b792"

RPROVIDES:${PN} += "skelcd-agama-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
