SUMMARY = "Command-line parsing module similar to getopt"
DESCRIPTION = "Command-line parsing module that uses a syntax similar to that of GNU getopt."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "erlang-getopt-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "b05fae3894919fea8e1f56cb35e99c48e47404fecf069f9fd322582db09022408e2176343cae67d9750dc1240735fa8c7326e83912d0ba10ecb6536564fdf4c2"

RPROVIDES:${PN} += "erlang-getopt"

RDEPENDS:${PN} += "erlang"

inherit rpm
