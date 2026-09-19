SUMMARY = "Pure python ISO manipulation library - common files"
DESCRIPTION = "PyCdlib is a pure python library to parse, write (master), and create ISO9660 \
files, suitable for writing to a CD or USB. \
 \
The original ISO9660 (including ISO9660-1999) specification is supported, as \
well the El Torito, Joliet, Rock Ridge, and UDF extensions. \
 \
This package includes the common files."
LICENSE = "LGPL-2.1-only"

PV = "1.16.0"

RPM_NAME = "python3-pycdlib-common-1.16.0-1.2.noarch.rpm"
RPM_HASH = "17e271b74f641fc4383966a9790416beeb66d24b01d683c0d2d62efb8fb03900ab5349b519706aeb696d5d726c3ef39e2377d6dfeda7f7faec47d533870849a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycdlib-common"

RDEPENDS:${PN} += ""

inherit rpm
