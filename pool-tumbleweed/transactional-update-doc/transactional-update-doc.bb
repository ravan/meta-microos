SUMMARY = "Documentation for transactional-update"
DESCRIPTION = "The Transactional Update Guide, man pages and D-Bus interface documentation \
in HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.1.3"

RPM_NAME = "transactional-update-doc-6.1.3-1.2.noarch.rpm"
RPM_HASH = "e0a6096f81e2aaf963a0904ebe29a84a2683e830cfb36b672a72fc0806924e486c34cdebe19bca7eecc3e0d98e430fceaf243c7dea7be07f7bb6e311db1e4da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transactional-update-doc"

RDEPENDS:${PN} += ""

inherit rpm
