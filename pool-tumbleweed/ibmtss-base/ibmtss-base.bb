SUMMARY = "IBM's TPM 2.0 TSS shared files"
DESCRIPTION = "Includes IBM's TPM 2.0 TSS certificates and policy files."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ibmtss-base-2.4.1-2.5.noarch.rpm"
RPM_HASH = "38d53b11f14026e3c58c9c7249d27f269852d02d3e16286cffb0d9aca475269f50c1e563e5c00cf47e38a18bd52f95835265d6ce640e34fe7a87c630809471d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibmtss-base"

RDEPENDS:${PN} += "/usr/bin/sh \
user-tss"

inherit rpm
