SUMMARY = "OpenBao server"
DESCRIPTION = "Files required to run a OpenBao server"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-server-2.6.2-1.1.noarch.rpm"
RPM_HASH = "05d6b0b3c34571fb7e36538578f7a287853da40946fc4f4c8bc03dc99f0c5ff29d5944cadcec5e006066160273d67388b888c3ea5b8efd0bc0604683aa4f7c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openbao-server \
openbao-server"

RDEPENDS:${PN} += "/usr/bin/sh \
group-openbao \
openbao \
user-openbao"

inherit rpm
