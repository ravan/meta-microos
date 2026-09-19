SUMMARY = "Busybox applets replacing whois"
DESCRIPTION = "This package contains the symlinks to replace whois with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-whois-1.38.0-42.2.noarch.rpm"
RPM_HASH = "8de8ae4cb990b38e09e0d8496e8fa6e5b552eac9e6bae8d2c5be92263617b38801a16e074169e66eb25378562e4fec2abdef17855597d1767868a1ae1028fb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-whois"

RDEPENDS:${PN} += "busybox"

inherit rpm
