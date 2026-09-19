SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "cpupower-bench-7.2.5-14.14.aarch64.rpm"
RPM_HASH = "fe2eedcd3e61990cd89320cb7ce9f1ca0ea4bb4d4252a3da7d9abefc9139e09e1193d75e061b4df1ec785084f72db05db3054f556e43a48231690dcc1d17b844"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.1 \
libm.so.6"

inherit rpm
