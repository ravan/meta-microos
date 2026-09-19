SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by the KDE games library."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdegames-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3cd1ae2c085c3a7e8f5c77aacdc7e5f88334b6820ed0dde6bf47ea23ace57e1b9f6a7c4e662f71a98ccb97e8c215974061e5a32f7a65af0c850bdda91a2bc9a5"

RPROVIDES:${PN} += "libkdegames"

RDEPENDS:${PN} += ""

inherit rpm
