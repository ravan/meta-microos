SUMMARY = "Backup scripts"
DESCRIPTION = "Shell scripts for system backup/restore"
LICENSE = "GPL-3.0-or-later"

PV = "1.35"

RPM_NAME = "tar-backup-scripts-1.35-10.1.noarch.rpm"
RPM_HASH = "a2c76429fed98c9e0139076906310b9eed37df6e9d72dcd1c8190770f9761b55eb3f503b32ba336d248f92abb946c995e21c01f35cc24bbe59ee91c43e4ad28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tar-backup-scripts \
tar-backup-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
tar"

inherit rpm
