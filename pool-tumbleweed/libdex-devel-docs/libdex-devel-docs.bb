SUMMARY = "Developer documentation for libdex"
DESCRIPTION = "This package contains developer documentation for writing \
applications with libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libdex-devel-docs-1.1.0-1.4.noarch.rpm"
RPM_HASH = "be1de139691f3e6be6606cc210c043b8c4c74aeff966274d8c30526333e0ada75fb53af66ef17c56f839a1ef18ab9de8e47d5111a0d647ddb5297e1295cc52cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdex-devel-docs"

RDEPENDS:${PN} += ""

inherit rpm
