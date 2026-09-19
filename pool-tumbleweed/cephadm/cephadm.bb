SUMMARY = "Utility to bootstrap Ceph clusters"
DESCRIPTION = "Utility to bootstrap a Ceph cluster and manage Ceph daemons deployed \
with systemd and podman."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "cephadm-18.2.7-8.1.noarch.rpm"
RPM_HASH = "d350b7a0cc330f871e9ec7f8b2288e1b52bb49552cf33956037de3b586981ac6e83fb279339ad9922126605674498e1b164f86e46ba66c35c3126b40c31c3d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephadm \
config-cephadm \
group-cephadm \
user-cephadm"

RDEPENDS:${PN} += "/usr/bin/sh \
lvm2 \
openssh-server \
python3 \
which"

inherit rpm
