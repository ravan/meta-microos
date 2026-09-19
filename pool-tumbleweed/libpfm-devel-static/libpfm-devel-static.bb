SUMMARY = "Static library version of libpfm"
DESCRIPTION = "This package contains the static variant of libpfm."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm-devel-static-4.13.0-2.8.aarch64.rpm"
RPM_HASH = "fd13110b1ff3199540762f42fc3425916a2655cea931337e80793a4018553b51fff33acbf0f35142f49e854ce45f6d243f673c60020ca7276ddd060199f2e6de"

RPROVIDES:${PN} += "libpfm-devel-static"

RDEPENDS:${PN} += "libpfm-devel"

inherit rpm
