SUMMARY = "Examples for Xapian-core libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval Library. \
 \
This subpackage contains some examples for Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "xapian-core-examples-1.4.27-1.6.aarch64.rpm"
RPM_HASH = "74f1f0d123364056c83b336a4c66d09fc9c7142b1180810b29e9bc8bd0a8924a8642c15e9aa2c64b371881faef450552c99e9ac92c72d7f0f81af1933bc04471"

RPROVIDES:${PN} += "xapian-core-examples"

RDEPENDS:${PN} += "xapian-core"

inherit rpm
