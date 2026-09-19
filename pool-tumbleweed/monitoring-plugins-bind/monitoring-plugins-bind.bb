SUMMARY = "Check whether BIND is running and to get the performance data via rndc stats"
DESCRIPTION = "check_bind.sh is a Nagios plugin to check the bind daemon whether it's running \
via its pid file and then gets the statistics via rndc stats. The user that run \
the script needs the ability to 'sudo rndc stats'! The timeframe in which the \
rndc stats output is updated is controlled by the check interval. The output \
shows amount of requests of various types occured during the last check \
interval. The script itself is written sh-compliant and free software under the \
terms of the GPLv2 (or later)."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "monitoring-plugins-bind-1.3-105.7.noarch.rpm"
RPM_HASH = "d2df2e27be535205367ff124b2a458f2e0e698a30d20f7b2fd03747b254ef5e9dff3455f80b490af5e98de4984331fd44e224e3c59baa8648fd72b54267dbb9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-bind \
nagios-plugins-bind"

RDEPENDS:${PN} += "/usr/bin/sh \
bind-utils \
coreutils \
gawk \
sudo"

inherit rpm
