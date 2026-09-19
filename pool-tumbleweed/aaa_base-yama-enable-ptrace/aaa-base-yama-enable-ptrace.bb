SUMMARY = "Sysctl setting to allow ptrace with the YAMA LSM enabled"
DESCRIPTION = "When the YAMA LSM is enabled, ptrace is restriced by default. On \
developer systems this has an impact on e.g. strace and gdb. So \
this package contains a setting that allows ptrace again. \
 \
See https://docs.kernel.org/admin-guide/LSM/Yama.html"
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260610.3b5a868c"

RPM_NAME = "aaa_base-yama-enable-ptrace-84.87+git20260610.3b5a868c-1.3.aarch64.rpm"
RPM_HASH = "24d367fd09d7a174359767adb75759e4cd2164b6fea07975392230f68e2cfc24faeb40d19566cf8671f9c9fd7a921a3aa495226e21a4cb46feb83f0240056104"

RPROVIDES:${PN} += "aaa-base-yama-enable-ptrace"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base"

inherit rpm
