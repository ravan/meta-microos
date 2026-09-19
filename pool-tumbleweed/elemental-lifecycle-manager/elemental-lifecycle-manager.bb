SUMMARY = "Elemental Lifecycle Manager"
DESCRIPTION = "Elemental Lifecycle Manager is a Kubernetes operator that manages the \
lifecycle of platforms built on Elemental."
LICENSE = "Apache-2.0"

PV = "0.1.0.20260602+9ae3c44"

RPM_NAME = "elemental-lifecycle-manager-0.1.0.20260602+9ae3c44-1.3.aarch64.rpm"
RPM_HASH = "b41019519e4ff7e4e83a6da6c99501e7c0be57b6fd4b58b288eaf88e6064c0867eea8e0833a020dd8557af4a79f0b408aa51d396843f91ff35d53744c5617ba4"

RPROVIDES:${PN} += "elemental-lifecycle-manager"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
