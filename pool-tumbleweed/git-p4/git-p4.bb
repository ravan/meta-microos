SUMMARY = "Git tools for importing Perforce repositories"
DESCRIPTION = "Tools for importing Perforce repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-p4-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "a194ec00d5eacb42206dcf8ebdcee960e291aadb8d822335cb29a1cf5ba45604fabc1489fdb87ee2f9963b7fb46f83709b9a9d0f5da50881c25dabd3228aa81d"

RPROVIDES:${PN} += "git-p4"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
git-core"

inherit rpm
