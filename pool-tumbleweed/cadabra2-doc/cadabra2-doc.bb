SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides html documentation for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.14"

RPM_NAME = "cadabra2-doc-2.5.14-3.1.noarch.rpm"
RPM_HASH = "ab6d83ef992d7fbcd0932c415cade5f990653580e1667df4ac7f0d27a917ed711a9d77338c6bac653b059d4b958fc1ed5f2072d7a4aaf8d29951cc8bff4438db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cadabra-doc \
cadabra2-doc"

RDEPENDS:${PN} += ""

inherit rpm
