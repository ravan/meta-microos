SUMMARY = "Command line tools for controlling Pacemaker clusters"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-cli package contains command line tools that can be used \
to query and control the cluster from machines that may, or may not, \
be part of the cluster."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-cli-3.0.3+20260728.7052efa194-1.1.aarch64.rpm"
RPM_HASH = "0c81d5cd1f1c409dfbafd5d0113bb2c06aaa691051986b0cc2ef1a4a3909118522599089479b458298d81e2656c456c8c8b8d5092506184d24663b9401d58d07"

RPROVIDES:${PN} += "pacemaker-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
group-haclient \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcib.so.54 \
libcrmcommon.so.68 \
libcrmservice.so.53 \
libglib-2.0.so.0 \
liblrmd.so.52 \
libncurses.so.6 \
libpacemaker.so.30 \
libpe-status.so.56 \
libqb.so.100 \
libstonithd.so.56 \
libtinfo.so.6 \
libxml2.so.16 \
logrotate \
pacemaker-libs \
perl-TimeDate \
procps \
psmisc"

inherit rpm
