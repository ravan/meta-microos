SUMMARY = "RRDtool frontend for Mail statistics"
DESCRIPTION = "Mailgraph is a very simple mail statistics RRDtool frontend for Postfix \
that produces daily, weekly, monthly and yearly graphs of received/sent \
and bounced/rejected mail (SMTP traffic)."
LICENSE = "GPL-2.0-or-later"

PV = "1.14"

RPM_NAME = "mailgraph-1.14-11.6.noarch.rpm"
RPM_HASH = "cae4d4626d1f7c65df38ba8e22290f23172888d06950917c7fe41079cce5a734ea2161f6c26d82b53e383fb9a2966aa2885a44efdf4cad83f7a2d4ae8008f75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/srv/www/htdocs/css \
config-mailgraph \
mailgraph"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-www \
logrotate \
perl-File--Tail \
perl-RRDs \
postfix \
rrdtool \
systemd \
user-wwwrun"

inherit rpm
