SUMMARY = "A sysctl monitoring tool based on BPF"
DESCRIPTION = "sysctl-logger is a sysctl monitoring tool that tracks changes to sysctl value."
LICENSE = "GPL-2.0-only"

PV = "0.0.7"

RPM_NAME = "sysctl-logger-0.0.7-1.9.aarch64.rpm"
RPM_HASH = "b7bb1264326f7c0f19641f011a4c9a7d0a416d65742e14a30aa45c1e37ab2a954534cb55a3e70ab04624a8bc99d68cdaaa32c08c99cfa1040571bfac441d05d3"

RPROVIDES:${PN} += "sysctl-logger"

RDEPENDS:${PN} += "/usr/bin/sh \
libbpf.so.1 \
libc.so.6"

inherit rpm
