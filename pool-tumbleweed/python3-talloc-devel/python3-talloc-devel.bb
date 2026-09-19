SUMMARY = "Developer tools for the Talloc library"
DESCRIPTION = "Libraries and Header Files to Develop Programs with python3-talloc Support"
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "python3-talloc-devel-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "b1a341d4d0fcd18a93d24c590be448e384c0ae7a5e2086ec4e8f171e8882d0bec6d2ba9eee407cbbd2cb5ebaeb39d823d531e0c6d2f934c84dc813dd1e23458a"

RPROVIDES:${PN} += "pkgconfig-pytalloc-util.cpython-313-aarch64-linux-gnu \
python3-talloc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkg-config \
python3-talloc"

inherit rpm
