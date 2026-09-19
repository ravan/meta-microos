SUMMARY = "Documentation for mtools, a toolset for MS-DOS filesystem access"
DESCRIPTION = "Mtools allows access to an MS-DOS file system on disk without \
mounting it. This subpackage contains the documentation for it."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "4.0.49"

RPM_NAME = "mtools-doc-4.0.49-1.6.aarch64.rpm"
RPM_HASH = "4c40e2324664b5656ee953e1bb5260a0c79ae58d49327d21d70b298b6ace8147b7875c627f3b1f5836c4102a94d6ef8ef3542599e131c248187bfaaf24c8ddd4"

RPROVIDES:${PN} += "mtools-doc"

RDEPENDS:${PN} += "mtools"

inherit rpm
