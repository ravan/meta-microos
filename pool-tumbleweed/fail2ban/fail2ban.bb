SUMMARY = "Bans IP addresses that make too many authentication failures"
DESCRIPTION = "Fail2ban scans log files like /var/log/messages and bans IP \
addresses that makes too many password failures. It updates firewall rules to \
reject the IP address, can send e-mails, or set host.deny entries.  These rules \
can be defined by the user. Fail2Ban can read multiple log files such as sshd \
or Apache web server ones."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "fail2ban-1.1.1-3.1.aarch64.rpm"
RPM_HASH = "287eb2a591f43f60eae9e7173a8e28d8957fd671881e57517ae08a2f5301a9533ec5b25fda479cb546e73afe25a68d74e115e559445a6e778db4816b0747c252"

RPROVIDES:${PN} += "config-fail2ban \
fail2ban \
python3.13dist-fail2ban \
python3dist-fail2ban"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
cron \
ed \
libc.so.6 \
libpython3.13.so.1.0 \
logrotate \
nftables \
python-abi \
python3 \
python3-pyinotify \
python3-setuptools \
python3-systemd \
systemd \
whois"

inherit rpm
