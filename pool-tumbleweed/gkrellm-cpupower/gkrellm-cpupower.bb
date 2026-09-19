SUMMARY = "Gkrellm plugin - CPU Frequency"
DESCRIPTION = "A gkrellm2 plugin for displaying and manipulating CPU frequency"
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "gkrellm-cpupower-0.2-2.39.aarch64.rpm"
RPM_HASH = "df8d0edbf656a6b3f3be2fc2235d6c7f5fb0fa41eb22776e83ac5770551ecdee0551a35dc583b6aa992a3267d0c60b300cf478090f4d4f01b53f3c785c93e5c3"

RPROVIDES:${PN} += "gkrellm-cpufreq \
gkrellm-cpupower"

RDEPENDS:${PN} += "cpupower \
gkrellm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
