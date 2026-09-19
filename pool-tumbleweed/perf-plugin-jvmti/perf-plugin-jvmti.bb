SUMMARY = "JVMTI agent for Java JIT profiling with perf"
DESCRIPTION = "This package contains the libperf-jvmti.so shared library agent. \
It allows the Linux 'perf' tool to map runtime Java Virtual Machine (JVM) \
Just-In-Time (JIT) compiled code addresses back to actual human-readable \
Java class and method names."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "perf-plugin-jvmti-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "27b533276803f834e4a794ae18334139c01ffb60e2793fdcf8ccafe693d6cd9d11ba63c9c2f9c683c651d9c4e8178ce076a7fe8dc8614e4ca4526233d576c476"

RPROVIDES:${PN} += "libperf-jvmti.so \
perf-plugin-jvmti"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1 \
libc.so.6 \
perf"

inherit rpm
