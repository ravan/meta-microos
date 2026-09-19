SUMMARY = "Documentation for libadapta"
DESCRIPTION = "Documentation for libadapta."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libadapta-docs-1.5.0-2.4.noarch.rpm"
RPM_HASH = "37e918c30c4a081134c8cfa889702e565918bcba218db5413a7c8d628f6d341e7b5eb563754ea69281ff758a6140f5c1d89fd70830258b94559a86421b63a695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadapta-docs"

RDEPENDS:${PN} += ""

inherit rpm
