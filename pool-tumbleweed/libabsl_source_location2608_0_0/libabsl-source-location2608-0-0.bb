SUMMARY = "Abseil library liblibabsl_source_location"
DESCRIPTION = "This package contains the libabsl_source_location library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_source_location2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "3ef3baa66d656dbcc0fe31f4aedbe410c8da5dedba0e1245ecb6eaeaccb8131d3233295f245ffe50e09d6b537a482f2cddee1cf0517377e4ba306a87aa38834b"

RPROVIDES:${PN} += "libabsl-source-location.so.2608.0.0 \
libabsl-source-location2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
