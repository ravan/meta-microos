SUMMARY = "Tool to analyze and report on system logs"
DESCRIPTION = "Logwatch is a customizable, pluggable log-monitoring system. It will go \
through system logs for a given period of time and make a report for the \
desired areas at the desired detail level."
LICENSE = "MIT"

PV = "7.14"

RPM_NAME = "logwatch-7.14-1.2.noarch.rpm"
RPM_HASH = "0310c75ed18a6b0332c126fd69e6202218c1ceba9aada94123cf518058a7f1d17136129f3b8eec630286aec6f1e2676edda7f051d7adbeb622bf10e4593f3aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-logwatch \
logwatch \
perl-Logwatch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
grep \
mailx \
perl \
perl-Date-Manip \
perl-HTML-Parser \
sh-utils \
systemd \
textutils"

inherit rpm
