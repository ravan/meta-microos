SUMMARY = "Sonar Icon Theme"
DESCRIPTION = "Sonar icon theme based on the upcoming GNOME icon theme."
LICENSE = "GPL-2.0-or-later"

PV = "11.3.1"

RPM_NAME = "sonar-icon-theme-11.3.1-31.9.noarch.rpm"
RPM_HASH = "8fbb500bc45386aa60e23c8addf78ae02060c910c90662ce7cde895d55631c7a87cb3dd2ef614bcf751785ef3fe50026e1b6221f439ab2410d1ba1e43a95ab97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icon-theme-sonar \
sonar-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme"

inherit rpm
