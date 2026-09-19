SUMMARY = "Inject PCIE AER errors into a running kernel"
DESCRIPTION = "aer-inject allows to inject PCIE AER errors on the software level into \
a running Linux kernel. This is intended for validation of the PCIE \
driver error recovery handler and PCIE AER core handler."
LICENSE = "GPL-2.0"

PV = "0.2"

RPM_NAME = "aer-inject-0.2-1.38.aarch64.rpm"
RPM_HASH = "8025a99ce6f8e074464e040f8c298ff38ec7c6e63d8aad1e313af9cce26da8b00eb09e2bd156a4320b16cca147e19090587300978fec1ffa6b9f1d91777c8713"

RPROVIDES:${PN} += "aer-inject"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
