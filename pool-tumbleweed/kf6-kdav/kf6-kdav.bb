SUMMARY = "DAV protocol implementation"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdav-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "dc0b02fbc2253166ccd86d741ee74b0125e74a450adb502d2aa1cd50fbb93d9fe69afa735d844d0cd9e9d55f514039a1cc39695faa1580b41b2b0cb978dc610b"

RPROVIDES:${PN} += "kf6-kdav"

RDEPENDS:${PN} += ""

inherit rpm
