SUMMARY = "Documentation for gr-satellites"
DESCRIPTION = "Documentation for gr-satellites module for GNU Radio."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & MIT"

PV = "5.9.0"

RPM_NAME = "gr-satellites-devel-doc-5.9.0-1.1.noarch.rpm"
RPM_HASH = "870e057b7881d7a0e954adc8eca828a7a2011fb58ca85a45b4ed3d9d9c60bfed5cef868598ce6922627e593d2fe81d4e455ada620e6ec516689cbfc9c607614f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-satellites-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
