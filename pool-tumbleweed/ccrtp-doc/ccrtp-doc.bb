SUMMARY = "Generated class documentation for ccrtp"
DESCRIPTION = "Generated class documentation for the ccrtp library from header \
files, html browsable."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "ccrtp-doc-2.1.2-2.37.noarch.rpm"
RPM_HASH = "227975468e05f9b3fac181d9e2d592f42dd7e50d84861e1539ae3998266b20c9f9993122fa0cb1d6b6ce0c6e3767881775917f917d4e29422eb7297da25dd2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccrtp-doc"

RDEPENDS:${PN} += ""

inherit rpm
