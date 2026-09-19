SUMMARY = "Simple AIDE testing"
DESCRIPTION = "Simple AIDE test script for externalized testing."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.2"

RPM_NAME = "aide-test-0.19.2-2.5.noarch.rpm"
RPM_HASH = "02445e84ee85b0c61899a3dc1ecab945ad6dbf181463a4666f972bd00045755c7df4de28e65eeacdf5812ccdb8af4ac33759d29eef20a8c1269b7a7e9a0dc019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aide-test"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
