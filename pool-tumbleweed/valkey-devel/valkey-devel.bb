SUMMARY = "Development header for Valkey module development"
DESCRIPTION = "Header file required for building loadable Valkey modules."
LICENSE = "BSD-3-Clause"

PV = "9.1.2"

RPM_NAME = "valkey-devel-9.1.2-1.1.aarch64.rpm"
RPM_HASH = "7c51bee81d2d6ec3ad9dd91ea9a4b2a3dd63cc6f0da91cc09a2a885e226266fd18b97dde15552cd2a90bede65ee5f462afc2ea6719efea85768672a933e26772"

RPROVIDES:${PN} += "rpm-macro-valkey-modules-abi \
rpm-macro-valkey-modules-dir \
valkey-devel"

RDEPENDS:${PN} += ""

inherit rpm
