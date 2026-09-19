SUMMARY = "Steam Big Picture Mode session based on gamescope"
DESCRIPTION = "Steam Big Picture Mode session based on gamescope. \
This opens Steam in the 'SteamOS' mode."
LICENSE = "MIT"

PV = "1+git20250418.7104815"

RPM_NAME = "gamescope-session-steam-1+git20250418.7104815-1.4.noarch.rpm"
RPM_HASH = "187cce6e0a4cd08e103c6fb1811c43b1f78cf41b479f60a7d891528f937899f792a41a074e1e0638bb3dd245ae5a89aad655addb0bf5e248e467dc4025bdee05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gamescope-session-steam"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
dejavu-fonts \
gamescope \
gamescope-session \
python3"

inherit rpm
