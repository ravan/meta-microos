SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python314-libpfm-4.13.0-2.8.aarch64.rpm"
RPM_HASH = "69ace6b8a2251211f6761e379c45c397a5ead8659f62738e21ac1add79405f04741346e68446e22d9d9c4a1a07c45b84fd2a357038d7a4be991f13eceaad2453"

RPROVIDES:${PN} += "python3.14dist-perfmon \
python314-libpfm \
python3dist-perfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4 \
libpfm4 \
python-abi"

inherit rpm
