SUMMARY = "Free Pascal interface to Qt6"
DESCRIPTION = "The qt6pas-devel package contains libraries and header files for \
developing applications that use qt5pas."
LICENSE = "LGPL-3.0-only"

PV = "4.8"

RPM_NAME = "libQt6Pas-devel-4.8-1.2.aarch64.rpm"
RPM_HASH = "ac6ae10acd2e73559e9ff568674ba2415d43b84069f94090327f6da4cb72bfe8b888cbe1d6776b0e55e6e1117c74f9cfdf7684f8e7c1695d65aeb4b6c98e800e"

RPROVIDES:${PN} += "libQt6Pas-devel"

RDEPENDS:${PN} += "libQt6Pas6"

inherit rpm
