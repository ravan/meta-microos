SUMMARY = "CUnit documentation"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit \
documentation files."
LICENSE = "LGPL-2.0-only"

PV = "2.1.3"

RPM_NAME = "cunit-doc-2.1.3-7.10.aarch64.rpm"
RPM_HASH = "e01fb929b7f3894f96875e3405977d77e8b835679096161048e93c6553f35c94a14d52adcf6e4f00038c852d627abc0bc5ec5d3dd42d594085633592408250e8"

RPROVIDES:${PN} += "cunit-doc"

RDEPENDS:${PN} += "libcunit1"

inherit rpm
