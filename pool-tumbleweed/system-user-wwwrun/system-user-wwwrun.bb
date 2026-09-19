SUMMARY = "System user wwwrun and group www"
DESCRIPTION = "This package provides the system account 'wwwrun' and group 'www'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-wwwrun-20250822-2.3.noarch.rpm"
RPM_HASH = "3d7d0fbf2ada2fa9c86e01e63f4dc6216a277bcf93750c9c9b8db92c57cbc9251e4f0776445d3761008d128a757bcac86c6a97e7bf79b649a9ce0cdd552f1495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-www \
group-wwwrun \
system-user-wwwrun \
user-wwwrun"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
