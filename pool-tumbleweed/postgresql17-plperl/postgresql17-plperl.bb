SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "17.11"

RPM_NAME = "postgresql17-plperl-17.11-2.2.aarch64.rpm"
RPM_HASH = "cd4a898ff5827af1434ab0516965ddd2f2dbc74cbd11cc2ff9e743f15e7a54f49d8946fc2ac6b6bc22ca02318b830d94fa2150d3547f6bafe61d64e5f89fdaae"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql17-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql17-server"

inherit rpm
