SUMMARY = "Timestamp standard input"
DESCRIPTION = "ts adds a timestamp to the beginning of each line of input. \
 \
It supports custom time formats as in the strftime function. It also supports converting existing timestamps in input to relative ones."
LICENSE = "GPL-2.0-or-later"

PV = "0.70"

RPM_NAME = "ts-0.70-1.9.noarch.rpm"
RPM_HASH = "7b7ff1be5d441c851008b5e2ddaad25ea0a1717c0e367dc5c70cc872c8cf7e190fd70a07179494ce115d70dba703803db8f3672dd12d68264c170f8e27519b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moreutils-/usr/bin/ts \
ts"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Date--Parse \
perl-Getopt--Long \
perl-POSIX \
perl-Time--Duration \
perl-Time--HiRes \
perl-strict \
perl-warnings"

inherit rpm
