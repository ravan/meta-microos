SUMMARY = "EXPERIMENTAL: Access storage via an unprivileged user process"
DESCRIPTION = "WARNING: lklfuse is EXPERIMENTAL; using it could cause data corruption! \
 \
lklfuse builds upon the Linux Kernel Library (LKL) to reuse kernel filesystem \
drivers as part of an unprivileged user-space application. \
 \
A udev rule and corresponding systemd user service are provided to \
automatically mount connected USB block devices."
LICENSE = "GPL-2.0-only"

PV = "0.6.4+git.4863.9c68545add5d"

RPM_NAME = "lklfuse-0.6.4+git.4863.9c68545add5d-2.1.aarch64.rpm"
RPM_HASH = "d1d001c6a832812b304732e6a1a6855240e8981b712df4e5730f331a6395ce77dee634ea9fb35b1de3e0300d35c08486b696da56b71efef0f3a49327c231df97"

RPROVIDES:${PN} += "group-lklfuse \
lklfuse \
user-lklfuse"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libfuse3.so.4 \
shadow"

inherit rpm
