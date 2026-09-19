SUMMARY = "Perl extension for portable daemons"
DESCRIPTION = "Net::Daemon is an abstract base class for implementing portable server \
applications in a very simple way. The module is designed for Perl 5.006 \
and ithreads, but can work with fork() as well. \
 \
The Net::Daemon class offers methods for the most common tasks a daemon \
needs: Starting up, logging, accepting clients, authorization, restricting \
its own environment for security and doing the true work. You only have to \
override those methods that aren't appropriate for you, but typically \
inheriting will safe you a lot of work anyways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.520.0"

RPM_NAME = "perl-Net-Daemon-0.520.0-1.3.noarch.rpm"
RPM_HASH = "3e11d594841c73f9e2099e0d65fdf285189bae549696a22be89a3480947f53cfd2659f9b7cf1913ebbb77d5ac739d449c623aa78b8af3c8c1664395ef417b345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Daemon \
perl-Net--Daemon--Log \
perl-Net--Daemon--Test \
perl-Net--Daemon--Test--Fork \
perl-Net--Daemon--Test--Win32 \
perl-Net-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sys--Syslog"

inherit rpm
