SUMMARY = "System user and group tftp"
DESCRIPTION = "This package provides the system account and group 'tftp'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-tftp-20250822-2.3.noarch.rpm"
RPM_HASH = "de1673948aa5764143ff7f2c1eeb92fceddf31c14b5b42212a717f3ab0fe5126d89b772cb25e968212a704a2d5a41338624a9a967bb668a69ad49c3d1038fc90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-tftp \
system-user-tftp \
user-tftp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
