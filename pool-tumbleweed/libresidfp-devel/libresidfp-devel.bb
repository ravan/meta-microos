SUMMARY = "Development files for libresidfp"
DESCRIPTION = "Development files for libresidfp."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "libresidfp-devel-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "498ece9810fe7e6b5aa80a9ca91190a6dc4a3f8aef22031f9eb42220423909ea8a48836ebe80fc99a75a2acc321c8342dc0a6d4c956c2faa0a8d822e61de6726"

RPROVIDES:${PN} += "libresidfp-devel \
pkgconfig-libresidfp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblibresidfp0"

inherit rpm
