SUMMARY = "Headers and sources for development with CLHEP Evaluator library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Evaluator library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Evaluator-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "7721af38a85889f2bdf1cbd489e6c2fc59615acc972f46b8c6822c30de71399d3bcac2992d5ed5eea53a392728face30bf882ccc88febc52056432b3e83e82a6"

RPROVIDES:${PN} += "clhep-Evaluator-devel \
pkgconfig-clhep-evaluator"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libCLHEP-Evaluator-2-4-7-2"

inherit rpm
