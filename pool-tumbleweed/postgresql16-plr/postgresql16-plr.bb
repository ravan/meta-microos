SUMMARY = "PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
Commands are available to access the database via the PostgreSQL Server \
Programming Interface (SPI) and to raise messages via elog() . There is no \
way to access internals of the database backend. However the user is able \
to gain OS-level access under the permissions of the PostgreSQL user ID, \
as with a C function. Thus, any unprivileged database user should not be \
permitted to use this language. It must be installed as an untrusted \
procedural language so that only database superusers can create functions \
in it. The writer of a PL/R function must take care that the function cannot \
be used to do anything unwanted, since it will be able to do anything that \
could be done by a user logged in as the database administrator. \
 \
An implementation restriction is that PL/R procedures cannot be used to \
create input/output functions for new data types."
LICENSE = "GPL-2.0-or-later"

PV = "8.4.8.6"

RPM_NAME = "postgresql16-plr-8.4.8.6-1.3.aarch64.rpm"
RPM_HASH = "ed6403b52780fc796abc17c0824222afbaf35457407042d238c3c93b58407b3159a1c87b2f50571cc1e02493a861f1202f50d662c6561aff6a4a26c3dc195bc3"

RPROVIDES:${PN} += "config-postgresql16-plr \
postgresql16-plr"

RDEPENDS:${PN} += "/sbin/ldconfig \
R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
postgresql16-server"

inherit rpm
