SUMMARY = "Documentation for qt6-wayland in QCH format"
DESCRIPTION = "This package contains documentation for qt6-wayland in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "53a169fea28f46b28a876a74d9a2f15aef65022a1a235f311da3c443352fe12e411a5c174d17c0ed723d3a7436c8a3cc1b9f486031f6b2661bcc438506ed10d9"

RPROVIDES:${PN} += "qt6-wayland-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
