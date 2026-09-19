SUMMARY = "G_F tables for Singular/libfactory"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. \
 \
This package contains the G_F tables."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libfactory-gftables-4.4.1-2.9.noarch.rpm"
RPM_HASH = "31825fc21395ec5b8234e7c75474fe4be6eb6df65c7d48b549dcca4dc3231fd58ca71ca96cf867abff5439b2fd476fabeb983e25a553c7f2e3080baa25fbf22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfactory-gftables"

RDEPENDS:${PN} += ""

inherit rpm
