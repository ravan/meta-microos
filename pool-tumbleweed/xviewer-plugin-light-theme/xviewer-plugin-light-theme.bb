SUMMARY = "Xviewer light-theme plugin"
DESCRIPTION = "xviewer Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-light-theme-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "0b6850bb1d1c103cc5535298e775fd9232d8353ab1a5e763886f74dd2273bc28be6aebf88e8e921efbb0d0d41fd746a7926852366759cab1ab71b8df161438e4"

RPROVIDES:${PN} += "xviewer-plugin-light-theme"

RDEPENDS:${PN} += "xviewer-plugins-data"

inherit rpm
