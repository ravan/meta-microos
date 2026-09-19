SUMMARY = "Abseil library liblibabsl_flags_program_name"
DESCRIPTION = "This package contains the libabsl_flags_program_name library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_program_name2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "0e7fce9f822be30443e29f19e9aece5a68cd5d426514fc9460964af3b90455592bc87b9ee221b95aaae77811b5d1a4bfdd75746696327135b661d8866203197e"

RPROVIDES:${PN} += "libabsl-flags-program-name.so.2608.0.0 \
libabsl-flags-program-name2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
