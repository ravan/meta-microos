SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-plperl-16.15-2.2.aarch64.rpm"
RPM_HASH = "6313dedf30c28f5e9862814631db619a8bd72c9832e37cf2273e547fe375172f659a4da72c614d434c19f30f2b6e4796e74dc8a0a352bddeb812259d3813eaab"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql16-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql16-server"

inherit rpm
