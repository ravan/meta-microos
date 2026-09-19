SUMMARY = "The Moby-project Linux container runtime"
DESCRIPTION = "Docker complements LXC with a high-level API which operates at the process \
level. It runs unix processes with strong guarantees of isolation and \
repeatability across servers. \
 \
Docker is a great building block for automating distributed systems: large-scale \
web deployments, database clusters, continuous deployment systems, private PaaS, \
service-oriented architectures, etc."
LICENSE = "Apache-2.0"

PV = "29.7.2_ce"

RPM_NAME = "docker-29.7.2_ce-41.1.aarch64.rpm"
RPM_HASH = "754a2270f9be61bdf68d5851184b9bf6d70e1f97c81051ed113d3dd5f6a15044aeaacdba4ae4b3e413ee1e16f804c61048bf4b3e7bc51613a3450f1be98afd16"

RPROVIDES:${PN} += "config-docker \
docker \
docker-libnetwork \
group-docker \
group-dockremap \
user-dockremap"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ca-certificates-mozilla \
catatonit \
containerd \
docker-buildx \
fillup \
iproute2 \
iptables \
libc.so.6 \
libsystemd.so.0 \
procps \
runc \
shadow \
sysuser-shadow \
tar \
udev \
xz"

inherit rpm
