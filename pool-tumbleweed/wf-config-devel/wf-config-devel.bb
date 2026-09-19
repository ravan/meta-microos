SUMMARY = "Development files for wf-config"
DESCRIPTION = "Development files for wf-config."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wf-config-devel-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "bffd4febf987cae9b43ed0f777fd1a315cad4128b56757acd3e8b67e2064acb9c92acd9c9f555a5ddf1f6f4f2e03eb76298edc60faf788c10146f6796f0495e8"

RPROVIDES:${PN} += "pkgconfig-wf-config \
wf-config-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwf-config1 \
pkgconfig-glm \
pkgconfig-libevdev \
pkgconfig-libxml-2.0"

inherit rpm
