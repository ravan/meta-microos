SUMMARY = "The Moby-project Linux container runtime"
DESCRIPTION = "Docker complements LXC with a high-level API which operates at the process \
level. It runs unix processes with strong guarantees of isolation and \
repeatability across servers. \
 \
Docker is a great building block for automating distributed systems: large-scale \
web deployments, database clusters, continuous deployment systems, private PaaS, \
service-oriented architectures, etc."
LICENSE = "Apache-2.0"

PV = "24.0.9_ce"

RPM_NAME = "docker-stable-24.0.9_ce-19.3.aarch64.rpm"
RPM_HASH = "f9751cd20641dcd27b48705d125784a7f2b87d5e5d0065eef0041a1c016da42e1d3990f77abccffbaf29be6c564bbe37b10d5754af5cbed0476f5548fc5fc45d"

RPROVIDES:${PN} += "config-docker-stable \
docker \
docker-libnetwork \
docker-stable \
group-docker \
group-dockremap \
user-dockremap"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ca-certificates-mozilla \
catatonit \
containerd \
docker-stable-buildx \
e2fsprogs \
fillup \
iproute2 \
iptables \
libc.so.6 \
libdevmapper.so.1.03 \
libsystemd.so.0 \
procps \
runc \
shadow \
sysuser-shadow \
tar \
udev \
xz"

inherit rpm
