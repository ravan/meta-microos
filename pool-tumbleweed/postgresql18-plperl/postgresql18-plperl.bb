SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-plperl-18.6-1.2.aarch64.rpm"
RPM_HASH = "0583ec82d19345b64fddc708095ba4b58ef5fda2cd0761ff7b3145f0512f576b47140e92449e80821446e4fe65359b2e2960614d598215c083e5c5c8bf659335"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql18-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql18-server"

inherit rpm
