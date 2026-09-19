SUMMARY = "Documentation files for unzip"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-rcc-doc-6.00-45.3.noarch.rpm"
RPM_HASH = "d4ddac2545666ca6df3ecc2f6814bb88b5117ecb5b5f7fb86c379a9230aa0efdd79d661f4cddbc722fd51342b4252f042013fd292b392e74523e6e9cb4707830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unzip-rcc-doc"

RDEPENDS:${PN} += ""

inherit rpm
