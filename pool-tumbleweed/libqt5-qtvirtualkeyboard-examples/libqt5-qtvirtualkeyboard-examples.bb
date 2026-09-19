SUMMARY = "Qt5 virtualkeyboard examples"
DESCRIPTION = "Examples for libqt5-qtvirtualkeyboard module."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "bade0722b30d2698fa0661ee1ef56718d9350d5c559b5038745695e2e7ae59cc9cdd8a83a136e0f6a6ff30a5b258cd9827d759a35252a2c1eeee8192ca507f19"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-examples"

RDEPENDS:${PN} += ""

inherit rpm
