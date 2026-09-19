SUMMARY = "System user and group mailman"
DESCRIPTION = "System user for use by the mailman client."
LICENSE = "GPL-3.0-only"

PV = "3.3.10"

RPM_NAME = "system-user-mailman-3.3.10-3.5.noarch.rpm"
RPM_HASH = "ff4e97948a131a700f91bba7064adbc3164a061e69b73f60463876ae9869d6dbe6fa11fb6b6c0104c1fa5f0fd2b2ac13e48dab4cdafe8537bb4b01fb4a8388ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-mailman \
system-user-mailman \
user-mailman"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lock \
group-mail \
sysuser-shadow"

inherit rpm
