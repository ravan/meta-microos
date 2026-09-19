SUMMARY = "Tumbleweed Update Scrutinizer"
DESCRIPTION = "Fetches snapshot scores from Boombatower and can prompt for update based on stability ratings. Searching the snapshot database is also allowed with regex support."
LICENSE = "GPL-3.0-or-later"

PV = "git20200908"

RPM_NAME = "twups-git20200908-2.8.noarch.rpm"
RPM_HASH = "08f8e6f43fe9a2e4697c7a6f2356efa9529bfe9ebfdbf9b40822a4a32baa81a06e95e408d102784e54554464b3b4e71c969f429a7eb309bec4cd640bb957adee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "twups"

RDEPENDS:${PN} += "/usr/bin/bash \
curl \
tumbleweed-cli"

inherit rpm
