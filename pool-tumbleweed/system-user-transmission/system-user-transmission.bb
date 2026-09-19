SUMMARY = "System user and group transmission"
DESCRIPTION = "System user for use by the transmission service"
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "system-user-transmission-4.1.3-1.2.noarch.rpm"
RPM_HASH = "f6f2169a27e84d782ee2e80bcddada296e4f7ad0f0290eaec721ca2123a1ea477a6112d78d9f9d4054ed50ee68617221443d6bb63ee360f6e41aff4ab5482f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-transmission \
system-user-transmission \
user-transmission"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
