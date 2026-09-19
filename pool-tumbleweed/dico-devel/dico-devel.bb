SUMMARY = "Development files to build modules for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains the development headers for developing modules for \
dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "dico-devel-2.12-2.5.aarch64.rpm"
RPM_HASH = "81c3f3fff5c21bea8fc7777ba344f096b0d43fc1dd9afd38f4a47204271fc48a74979fb1d0950de8fec098522f7a06edccf55762da45ad8f4a53bb6e7f17cfa6"

RPROVIDES:${PN} += "dico-devel"

RDEPENDS:${PN} += "libdico2"

inherit rpm
