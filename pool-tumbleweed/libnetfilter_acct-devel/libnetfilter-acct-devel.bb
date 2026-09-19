SUMMARY = "Userspace library for the in-kernel Netfilter counters"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended accounting infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libnetfilter_acct-devel-1.0.3-2.20.aarch64.rpm"
RPM_HASH = "f0e0a8090480790674f183c1eea68fe8b9aa81ce677bb88933d6527f3f54c336900c4ff6761871e69fcf248c3739425186b0929e1b371ff3e807a4ea37f54d8f"

RPROVIDES:${PN} += "libnetfilter-acct-devel \
pkgconfig-libnetfilter-acct"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-acct1"

inherit rpm
