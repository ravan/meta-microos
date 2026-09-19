SUMMARY = "Rpm plugin for fapolicyd support"
DESCRIPTION = "Rpm plugin for fapolicyd support."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-fapolicyd-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "80a3bf6733c0c9ab3e60b0c2ee1ab7056a64425c8d0d6d912d8c6a1c4e86dd4b8b520031076003d5c68d21bd06c08baf31e9a385af583d768667ae181253523b"

RPROVIDES:${PN} += "rpm-plugin-fapolicyd"

RDEPENDS:${PN} += "rpm"

inherit rpm
