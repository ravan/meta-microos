SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "cpupower-devel-7.2.5-14.14.aarch64.rpm"
RPM_HASH = "8515509bbd933bdc29609168d2e31994b23cbbc09edef7c7f6635d50342644b75472ab81046d98b2ae80832de29d0f19b6199beccaeebf3ea8e835b2248138e0"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower1"

inherit rpm
