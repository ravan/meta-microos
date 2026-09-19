SUMMARY = "Abseil library liblibabsl_flags_commandlineflag_internal"
DESCRIPTION = "This package contains the libabsl_flags_commandlineflag_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_commandlineflag_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "3847154c6a74ae5789351d9b9d0b74fae50b277263dc4590cb08d00179b9369f12866def9a5b1dd3f1f0a58cb49d6ccab811558f9aa74ce8e2d280d8118c7ff0"

RPROVIDES:${PN} += "libabsl-flags-commandlineflag-internal.so.2608.0.0 \
libabsl-flags-commandlineflag-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstdc++.so.6"

inherit rpm
