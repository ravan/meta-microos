SUMMARY = "Address Database for mutt"
DESCRIPTION = "The Little Brother's Database (lbdb) consists of a set of small tools \
that collect mail addresses from several sources and offer these \
addresses to the external query feature of the Mutt mail reader. \
 \
To use the fetch address feature, put the following lines in your \
.procmailrc: \
 \
:0hc | lbdb-fetchaddr \
 \
To use the database in mutt, put the following line into your .muttrc: \
 \
set query_command='lbdbq %{s}'"
LICENSE = "GPL-2.0-or-later"

PV = "0.52.1"

RPM_NAME = "lbdb-0.52.1-1.11.aarch64.rpm"
RPM_HASH = "6482efc0b0d43ff9718ea94b7a1f29db20f2684aed828928b1e16f97d81bbcf4a8cc3227c8d8db0d4f455a5a42c26c17c5b65584df1defb1cea812330937c538"

RPROVIDES:${PN} += "config-lbdb \
lbdb"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
