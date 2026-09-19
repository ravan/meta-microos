SUMMARY = "A distributed multi-protocol load testing tool"
DESCRIPTION = "tsung is a distributed load testing tool. \
It is protocol-independent and can currently be used to stress and \
benchmark HTTP, Jabber/XMPP, PostgreSQL, MySQL and LDAP servers. \
It simulates user behaviour using an XML description file, reports \
many measurements in real time (statistics can be customized with \
transactions, and graphics generated using gnuplot). \
For HTTP, it supports 1.0 and 1.1, has a proxy mode to record \
sessions, supports GET and POST methods, Cookies, and Basic \
WWW-authentication. It also has support for SSL. \
 \
More information is available at http://tsung.erlang-projects.org/ ."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "tsung-1.8.0-2.7.aarch64.rpm"
RPM_HASH = "28244634572899d7e4639e52079fb000132644938bcd9e16c7f9aab7bc9127fd9ed20ceb56e098c8c04bd704b2a055b9c6e0e93a7ab0dd72a4c1f45f6c75c9d8"

RPROVIDES:${PN} += "tsung"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/python3 \
bash \
erlang \
perl-Template"

inherit rpm
