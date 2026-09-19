SUMMARY = "Parallel remote shell program"
DESCRIPTION = "Pdsh is a multithreaded remote shell client which executes commands on \
multiple remote hosts in parallel.  Pdsh can use several different \
remote shell services, including Kerberos IV and ssh."
LICENSE = "GPL-2.0-or-later"

PV = "2.36"

RPM_NAME = "pdsh-2.36-1.2.aarch64.rpm"
RPM_HASH = "fe496967148bee12854fd9e553d1c994f7bdef4634d004fb29f897a50e52464602f130046dedc58bcb95fe0746820d3171c498f78e0f40d702d63a761bb4162e"

RPROVIDES:${PN} += "pdsh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
