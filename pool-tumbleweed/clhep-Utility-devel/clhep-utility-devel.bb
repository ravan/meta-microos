SUMMARY = "CLHEP Utility library"
DESCRIPTION = "This package provides the header-only Utility library from CLHEP."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Utility-devel-2.4.7.2-1.4.noarch.rpm"
RPM_HASH = "fdcd390a2dbf2092754d1a6364a6f2b70d473de9f2ad343ed04e87ab9f60a1eb03d7f6a8f68e5bc8828ad8418abd34f86c04586e6eda576e30eee7fec6ddd6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clhep-Utility-devel"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
