SUMMARY = "Galera: a synchronous multi-master wsrep provider (replication engine)"
DESCRIPTION = "Galera is a fast synchronous multimaster wsrep provider (replication engine) \
for transactional databases and similar applications. For more information \
about wsrep API see http://launchpad.net/wsrep. For a description of Galera \
replication engine see http://www.codership.com. \
 \
Copyright 2007-2015 Codership Oy. All rights reserved. Use is subject to license terms under GPLv2 license. \
 \
This software comes with ABSOLUTELY NO WARRANTY. This is free software, \
and you are welcome to modify and redistribute it under the GPLv2 license."
LICENSE = "GPL-2.0-only"

PV = "26.4.22"

RPM_NAME = "galera-4-26.4.22-2.9.aarch64.rpm"
RPM_HASH = "7ea751122ec5ffb004f5851ab8dd3cb382e445213a31e2f4ffcd75b392d8fcda325d449fc119fd36313e1ec4e86579696229b6c126494c7d7f9241ea8f9df088"

RPROVIDES:${PN} += "config-galera-4 \
galera-4 \
group-garb \
user-garb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
galera-4-wsrep-provider \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
sysuser-shadow"

inherit rpm
