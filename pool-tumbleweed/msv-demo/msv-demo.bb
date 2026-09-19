SUMMARY = "Samples for Multi-Schema Validator"
DESCRIPTION = "Samples for Multi-Schema Validator."
LICENSE = "BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-demo-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "d1b030340a0648a40d212d8e251cd60989df4d571f5a40de4828df96dccca092399f530ade21399c071dfaa4f1a6cc5126e7f475a9274e607767f53cf49ca218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-demo"

RDEPENDS:${PN} += "msv-msv \
msv-xsdlib"

inherit rpm
