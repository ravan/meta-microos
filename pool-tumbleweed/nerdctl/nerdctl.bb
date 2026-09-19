SUMMARY = "Docker-compatible CLI for containerd"
DESCRIPTION = "nerdctl is a Docker-compatible CLI for containerd."
LICENSE = "Apache-2.0"

PV = "2.3.5"

RPM_NAME = "nerdctl-2.3.5-1.2.aarch64.rpm"
RPM_HASH = "c70b8e45b2f703a2e9eb9922c85d480ee62ae944135d30331ba8a368b13e299e33d0b27e6feb6fdd7700f07cdb510c3e37a3b4e7029f6a0dbe3e3dae938e9204"

RPROVIDES:${PN} += "nerdctl"

RDEPENDS:${PN} += "/usr/bin/sh \
buildkit \
cni-plugins \
containerd \
iptables \
libc.so.6 \
rootlesskit \
slirp4netns"

inherit rpm
