SUMMARY = "System-level exploration"
DESCRIPTION = "Sysdig is open source, system-level exploration: capture system state and \
activity from a running Linux instance, then save, filter and analyze. \
Think of it as strace + tcpdump + lsof + awesome sauce. With a little Lua \
cherry on top."
LICENSE = "Apache-2.0"

PV = "0.41.4"

RPM_NAME = "sysdig-0.41.4-1.4.aarch64.rpm"
RPM_HASH = "8e405128b728ba26256ef3331d1e72a7a6556d6f28fd7fa29c6c9052b7d884cacec7e8c908528e314b653a9bd68b6c47b9810655d2aa09fde9c8e376861f3459"

RPROVIDES:${PN} += "sysdig"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libelf.so.1 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libluajit-5.1.so.2 \
libm.so.6 \
libncurses.so.6 \
libre2.so.11 \
libstdc++.so.6 \
libtbb.so.12 \
libtinfo.so.6 \
libyaml-cpp.so.0.9 \
libz.so.1"

inherit rpm
