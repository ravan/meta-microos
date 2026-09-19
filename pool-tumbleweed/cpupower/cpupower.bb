SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle). \
Also part of the package are: \
turbostat version 2026.04.21 \
intel-speed-select 1.26 \
Kernel changelog: \
* Sat Sep 12 2026 jslaby@suse.cz \
- Update \
... \
- commit 6b7e8a9"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "cpupower-7.2.5-14.14.aarch64.rpm"
RPM_HASH = "1561613c591d730ea5f95d36186cf661901fb4f693ac30f0ea09552dec618a82be79f9635ecd5a4f5e7e156f5c950854e64635d1f57ef1ffca0365b108392800"

RPROVIDES:${PN} += "config-cpupower \
cpupower"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.1"

inherit rpm
