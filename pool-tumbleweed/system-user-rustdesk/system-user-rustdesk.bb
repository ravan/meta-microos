SUMMARY = "System user for rustdesk-server"
DESCRIPTION = "System user for rustdesk-server."
LICENSE = "AGPL-3.0-only"

PV = "1.1.16"

RPM_NAME = "system-user-rustdesk-1.1.16-2.3.noarch.rpm"
RPM_HASH = "29216c53bbf4a3dae2d0567ef3022d4710a6422247f12e957cddbc4f069e3edb5d9cdc60d0c984e7f70451687473464b346aa01c528fcba82500980aa11d2c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-rustdesk \
system-user-rustdesk \
user-rustdesk"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
