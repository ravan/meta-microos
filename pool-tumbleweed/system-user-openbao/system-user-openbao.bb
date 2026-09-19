SUMMARY = "System user and group 'openbao'"
DESCRIPTION = "This package provides a system user for the OpenBao service"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-openbao-1.0.0-1.7.noarch.rpm"
RPM_HASH = "c47d6fcabf3faa47307bd880bc0a690f05b3a6d142a0a1658f1c73923ee4c92160d890488ab7887e4306d1c58b947b8dc267c63a539e67719b38784d45e277e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-openbao \
system-user-openbao \
user-openbao"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
