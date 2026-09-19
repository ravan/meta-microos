SUMMARY = "Toolkit for building secure, portable and lean operating systems for containers"
DESCRIPTION = "LinuxKit, a toolkit for building custom minimal, immutable Linux distributions. \
 \
* Secure defaults without compromising usability \
* Everything is replaceable and customisable \
* Immutable infrastructure applied to building Linux distributions \
* Completely stateless, but persistent storage can be attached \
* Easy tooling, with easy iteration \
* Built with containers, for running containers \
* Designed to create reproducible builds [WIP] \
* Designed for building and running clustered applications, including but not \
  limited to container orchestration such as Docker or Kubernetes \
* Designed from the experience of building Docker Editions, but redesigned as a \
  general-purpose toolkit \
* Designed to be managed by external tooling, such as Infrakit (renamed to \
  deploykit which has been archived in 2019) or similar tools \
* Includes a set of longer-term collaborative projects in various stages of \
  development to innovate on kernel and userspace changes, particularly around \
  security \
 \
LinuxKit currently supports the x86_64, arm64, and s390x architectures on a \
variety of platforms, both as virtual machines and baremetal (see below for \
details)."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "linuxkit-1.8.2-1.6.aarch64.rpm"
RPM_HASH = "50901ddcd86ed3d0c1886ea3ca7870cb309559b7d6fa75f6307799a028849682b9adf53e8e055303b41e156b06270b1343fc6bad35ded42731e8b1411c75b524"

RPROVIDES:${PN} += "linuxkit"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
