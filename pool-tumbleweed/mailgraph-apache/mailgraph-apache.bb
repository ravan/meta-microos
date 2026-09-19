SUMMARY = "Files and dependencies to show mailgraph stats in apache"
DESCRIPTION = "This package contains files (and dependencies) to show the generated \
mailgraph statistics in an apache webserver. \
 \
Mailgraph is a very simple mail statistics RRDtool frontend for Postfix \
that produces daily, weekly, monthly and yearly graphs of received/sent \
and bounced/rejected mail (SMTP traffic)."
LICENSE = "GPL-2.0-or-later"

PV = "1.14"

RPM_NAME = "mailgraph-apache-1.14-11.6.noarch.rpm"
RPM_HASH = "227e0c32a06534cc2299b7b3c96f0293da5d9b70af868373972e55589e0636403fa6c30f5f1f3db18f2cc1cfa06af8717ed839836fd8050626f2fee135a5396a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mailgraph-apache"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2-mod-perl \
mailgraph"

inherit rpm
