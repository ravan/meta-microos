SUMMARY = "Firewalld testsuite"
DESCRIPTION = "This package provides the firewalld testsuite."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewalld-test-2.3.2-2.1.noarch.rpm"
RPM_HASH = "12f901d38cc610d001da6788339c170a1505ff3ad0b98f424ee5fea5cc977d60890cfc385fb12a578840b0888edbd5c0c4396b16cc2605d1ddcd9ce013fddc37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-test"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
