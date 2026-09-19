SUMMARY = "Service orchestration and management tool"
DESCRIPTION = "Serf is a service orchestration and management tool. \
 \
It offers a decentralized, lightweight, highly available and fault \
tolerant solution for service discovery and orchestration that runs \
on Linux, Mac OS-X and Windows. \
 \
An efficient and lightweight gossip protocol is used to communicate \
among the nodes, and node failures are detected and notified to the rest \
of the cluster. An event system is built on top of Serf, so that events \
such as deploys, configuration changes, et.c, can be propagated around. \
Serf is also completely masterless, meaning there's no single point of \
failure. \
 \
This package provides the agent that should be started on every node."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & MPL-2.0"

PV = "0.10.4"

RPM_NAME = "hashicorp-serf-0.10.4-1.1.aarch64.rpm"
RPM_HASH = "307a42865db1e42771274a5a3da8229c889d2784d4c342ff72096cab75eb8d0c06197b3f9d79603a57dee145dd858a45895b86a9436d73121ef5586ac9ffe850"

RPROVIDES:${PN} += "group-serf \
hashicorp-serf \
user-serf"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
systemd \
sysuser-shadow \
sysuser-tools"

inherit rpm
