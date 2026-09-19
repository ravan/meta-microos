SUMMARY = "Obtain the IP address for a given host/domain"
DESCRIPTION = "This plugin uses the nslookup program to obtain the IP address for the given \
host/domain query. \
 \
An optional DNS server to use may be specified. If no DNS server is specified, \
the default server(s) specified in /etc/resolv.conf will be used."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dns-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "452120ce04d7ccc0e876647f9f909357902684feca6559ecccb198af223d94f4a23f681d8dc8da74ce3c75b1202a14520dafd041045d210218db03e3802c56a7"

RPROVIDES:${PN} += "monitoring-plugins-dns \
nagios-plugins-dns"

RDEPENDS:${PN} += "/usr/bin/nslookup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
