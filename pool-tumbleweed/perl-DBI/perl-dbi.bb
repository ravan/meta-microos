SUMMARY = "Database independent interface for Perl"
DESCRIPTION = "The DBI is a database access module for the Perl programming language. It \
defines a set of methods, variables, and conventions that provide a \
consistent database interface, independent of the actual database being \
used. \
 \
It is important to remember that the DBI is just an interface. The DBI is a \
layer of 'glue' between an application and one or more database _driver_ \
modules. It is the driver modules which do most of the real work. The DBI \
provides a standard interface and framework for the drivers to operate \
within. \
 \
This document often uses terms like _references_, _objects_, _methods_. If \
you're not familiar with those terms then it would be a good idea to read \
at least the following perl manuals first: perlreftut, perldsc, perllol, \
and perlboot."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.653.0"

RPM_NAME = "perl-DBI-1.653.0-1.1.aarch64.rpm"
RPM_HASH = "962d626d3db635675222062580d18ccbfc7b2aba4480844f995ea5d489551a4c033f748cf336ad2d228560bb39c038c6c5ae304456da115dbf919961b350b1b6"

RPROVIDES:${PN} += "perl-DBI"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Module--Load"

inherit rpm
