SUMMARY = "Development files for zinnia"
DESCRIPTION = "The zinnia-devel package contains libraries and header files for \
developing applications that use zinnia."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "zinnia-devel-0.07-2.19.aarch64.rpm"
RPM_HASH = "0b1e889dd370a5613915fa58727279ed53a21e0510ea45bebcc33ccfcd30d40ba0acd4733e858ba1f9bd66d26e934ce3d2fd6980b96bbc70999f1ed0ffeb4316"

RPROVIDES:${PN} += "pkgconfig-zinnia \
zinnia-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzinnia0"

inherit rpm
