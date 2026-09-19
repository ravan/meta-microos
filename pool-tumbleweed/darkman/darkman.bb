SUMMARY = "Framework for dark-mode and light-mode transitions"
DESCRIPTION = "darkman is a tool that allows automating transitioning to dark mode \
and sundown, and back to light mode at sunrise. It allows placing \
drop-in scripts to be run automatically at those times."
LICENSE = "ISC"

PV = "2.0.1"

RPM_NAME = "darkman-2.0.1-1.8.aarch64.rpm"
RPM_HASH = "5be851841c43d24b0da8d31f95e8f45b2aa61efb8a39694a5235d64cc8c64631c9093b156ff1512cf3fa37e2a62934de801d80769f9596a2422927d14665ab0d"

RPROVIDES:${PN} += "darkman"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
