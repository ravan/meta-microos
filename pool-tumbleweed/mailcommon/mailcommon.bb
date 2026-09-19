SUMMARY = "Base KDE PIM library for mail-handling applications"
DESCRIPTION = "The mailcommon library is a KDE PIM project to provide a \
framework to build applications which handle e-mail."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "mailcommon-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0645498b52086711ad2f503d7140135db1bebf28154856e658636908dea03a53d14833cfd6997f6f76ca83c0c39ecc92ee5897d9a40664522bddef84f5fce4ad"

RPROVIDES:${PN} += "mailcommon"

RDEPENDS:${PN} += ""

inherit rpm
