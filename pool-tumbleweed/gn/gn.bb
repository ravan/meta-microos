SUMMARY = "A meta-build system that generates build files for Ninja"
DESCRIPTION = "GN is a meta-build system that generates build files for Ninja."
LICENSE = "BSD-3-Clause"

PV = "0.20260907"

RPM_NAME = "gn-0.20260907-1.1.aarch64.rpm"
RPM_HASH = "f1a3ad3f30d7100be3183f85504b0e521f6e59787d447fbec23377db22fe0eeeb9523da827da1f3d88e170270a165121089afe96eefcfac964640f2186ee7f12"

RPROVIDES:${PN} += "gn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
