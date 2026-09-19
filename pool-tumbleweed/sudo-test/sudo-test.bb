SUMMARY = "Tests for the package"
DESCRIPTION = "Tests for fate#313276"
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "sudo-test-1.9.17p2-4.1.aarch64.rpm"
RPM_HASH = "f778538b7cc3e81767a50f020df0e48e2ddeda4702020c235558156398da1df818066c7831c663225b93bb32991cdfcf2f2a362670283e4944d6ff10c8b039b8"

RPROVIDES:${PN} += "sudo-test"

RDEPENDS:${PN} += "/usr/bin/sh \
sudo"

inherit rpm
