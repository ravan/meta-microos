SUMMARY = "GAP: Library of local nearrings"
DESCRIPTION = "The LocalNR package contains the library of local nearrings of small \
orders and some functions to analyze finite nearrings."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "gap-localnr-2.1.0-1.1.noarch.rpm"
RPM_HASH = "052495bfac260002f6adf31c8eeede7f9816d90bb6c732955a559df8e6c2a7fefde0645f79ec974fafb2857cb835f413533d97371d5a64c6d3c5e0e671846312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-localnr"

RDEPENDS:${PN} += "gap-core \
gap-sonata"

inherit rpm
