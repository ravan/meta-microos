SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides examples for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.14"

RPM_NAME = "cadabra2-examples-2.5.14-3.1.noarch.rpm"
RPM_HASH = "493d6f4466f82563cfb5d87df1d7d5b893a2563babc172d969469d31d1a372927c1f83d9b23c62c4b83457fce1cd193962f3c58ed8a901362b226d6d2595d783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cadabra2-examples"

RDEPENDS:${PN} += "cadabra2"

inherit rpm
