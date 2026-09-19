SUMMARY = "a simple http server class with SSL support"
DESCRIPTION = "HTTP::Daemon::SSL is a descendant of HTTP::Daemon that uses SSL sockets \
(via IO::Socket::SSL) instead of cleartext sockets.  It also handles \
SSL-specific problems, such as dealing with HTTP clients that attempt \
to connect to it without using SSL."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-HTTPS-Daemon-1.04-70.46.aarch64.rpm"
RPM_HASH = "c7002dc57d7e665c542cb5f03cdbe5e7c3bf037fd3091a6a516c7c00a789fdb4d82a6159635492dba8ceb1954d6524aa14c69555f8dd6348ca1dd5a9473e9417"

RPROVIDES:${PN} += "perl-HTTP--Daemon--ClientConn--SSL \
perl-HTTP--Daemon--SSL \
perl-HTTP--Daemon--SSL--DummyDaemon \
perl-HTTPS-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO-Socket-SSL \
perl-libwww-perl"

inherit rpm
