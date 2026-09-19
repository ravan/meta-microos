SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "15.19"

RPM_NAME = "postgresql15-plperl-15.19-2.2.aarch64.rpm"
RPM_HASH = "598f47fbabd60f6edff57a1357a571413a7dcae71868d18077a23a1b9f3debfc5f9d6c3b2011a8287804c81f3555be002c7b107424ebb18c28d274ae9d8a68f6"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql15-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql15-server"

inherit rpm
