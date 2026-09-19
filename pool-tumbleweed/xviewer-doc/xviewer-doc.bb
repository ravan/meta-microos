SUMMARY = "Html documentation for xviewer"
DESCRIPTION = "This package provides the docs for xviewer"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.4.16"

RPM_NAME = "xviewer-doc-3.4.16-2.3.noarch.rpm"
RPM_HASH = "a0ca043d975a558062ed64d737ffc13b254f90c365c5ea5238121fc1e25290fadcf3caa2e568055484660d86d991ea03e0d42627a4223e003babdaf007c6437e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xviewer-doc"

RDEPENDS:${PN} += ""

inherit rpm
