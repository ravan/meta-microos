SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-dlna-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "a3e0d1a9ae345d78d7f23eee24e6aefbe24dc9cc26a2685ef14bd30cb46130a075c044bca75d8bd31bafc74878deb79ba12a70131f8deee9b728decf7fe1521b"

RPROVIDES:${PN} += "gupnp-dlna"

RDEPENDS:${PN} += ""

inherit rpm
