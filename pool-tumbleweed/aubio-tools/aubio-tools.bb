SUMMARY = "Example programs for aubio library"
DESCRIPTION = "This package includes the example programs for aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9+git376"

RPM_NAME = "aubio-tools-0.4.9+git376-1.1.aarch64.rpm"
RPM_HASH = "ff140c6a8071cf4e6abc2427a89f27ccb7cba7513c42c9aa3696a01a1f24bddf434496ec46508388dd1d9932e6430f89c7430220d9ee917a941fa4bebdfc5962"

RPROVIDES:${PN} += "aubio-tools"

RDEPENDS:${PN} += "libaubio.so.5 \
libc.so.6 \
libjack.so.0"

inherit rpm
