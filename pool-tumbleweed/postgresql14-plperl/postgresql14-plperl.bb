SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "14.24"

RPM_NAME = "postgresql14-plperl-14.24-2.2.aarch64.rpm"
RPM_HASH = "3b1e4260fb6d7f5c2b583d0591eaa2c59c47776d1305ba695b583e7ebcc3ea11ab2c11427b12a85e8e8d8f42daaf49fb449fe70cb46734243cd36d1aecdea473"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql14-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql14-server"

inherit rpm
