SUMMARY = "Local resource monitor agent for Zabbix rewrite in golang"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-agent2-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "49fea610daf967f60bd60ec08e800af39ad98973795323e8ffebd160e8d0822f25b0a137c6d838d35be46f051aa3f2aa32d19d93e729d261484af22d26fc40c9"

RPROVIDES:${PN} += "config-zabbix-agent2 \
zabbix-agent2"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-zabbix \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssl.so.3 \
logrotate \
shadow \
update-alternatives \
user-zabbix"

inherit rpm
