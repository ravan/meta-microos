SUMMARY = "Freepascal Compiler examples"
DESCRIPTION = "The fpc-examples package contains examples for Freepascal."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-examples-3.2.2-5.15.noarch.rpm"
RPM_HASH = "568bad0830b0583cafe4b15694f3d42137911b3885d2dbc5b8802abe0924465f76fb095cc5be7edd0fee0bf3d210ed230d825357a78cb3adfbeb587dddc4aa3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
