SUMMARY = "Package for testing the update stack during product development"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
We will provide a 'always' working update for this package so that the \
update stack could be easily tested."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-trivial-5.2-1.15.aarch64.rpm"
RPM_HASH = "4af75bc0472fb89cde33463f357a15e0fe20e813b9d9bf28cc4bafe3189ba2f6d9ade9d42a062543fc5db2cd9570145976ffb1aed6a4c8f8022a0a9f87f636ac"

RPROVIDES:${PN} += "update-test-trivial"

RDEPENDS:${PN} += ""

inherit rpm
