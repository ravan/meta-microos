SUMMARY = "Cryptographic Tools"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
This package contains a few command-line tools to perform cryptographic \
operations using the nettle library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "nettle-3.10.2-1.6.aarch64.rpm"
RPM_HASH = "f81d1963f9521ca2f622ddf5a65207c29ec847153188d8ffc82ae32d6376e5ca71c254eebb1f711469a411be8c7868a1d56ca826e7be0e2cd2bb7eda3d658578"

RPROVIDES:${PN} += "nettle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
