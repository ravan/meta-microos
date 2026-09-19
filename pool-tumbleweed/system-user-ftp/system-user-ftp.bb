SUMMARY = "System user and group ftp"
DESCRIPTION = "This package provides the system account and group 'ftp'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-ftp-20250822-2.3.noarch.rpm"
RPM_HASH = "0c0e00c0c999311a611dcbc64fc63e43ff2b25fcfb8308915637d777abfbed8bdb659a9bf2e3fb81051112ac9071209a840fefff0ae439aea5b8aadc1df3af28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-ftp \
system-user-ftp \
user-ftp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
