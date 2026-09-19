SUMMARY = "Example source code for programs to use libical"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
calendaring and scheduling protocols (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "libical-doc-3.0.20-1.6.noarch.rpm"
RPM_HASH = "acdd4dca64a9bebd54d531d053a40b92aa86bcd4becd7e5f32296e9422b1ce056733658ef6b9dce9b04404d31daf4b883b038cc8b61f5856ea278a7d30269e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libical-doc"

RDEPENDS:${PN} += ""

inherit rpm
