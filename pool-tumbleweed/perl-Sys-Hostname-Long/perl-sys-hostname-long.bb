SUMMARY = "Try every conceivable way to get full hostname"
DESCRIPTION = "How to get the host full name in perl on multiple operating systems (mac, \
windows, unix* etc)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.500.0"

RPM_NAME = "perl-Sys-Hostname-Long-1.500.0-1.9.noarch.rpm"
RPM_HASH = "2cff9c76793ccf3926aeebb9893b8040c08818bd629498d77b566bd7e20b58b71811ef80ff309c133849960fdb40775e7d3111830eec13b449a9fe790e49fef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sys--Hostname--Long \
perl-Sys-Hostname-Long"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
