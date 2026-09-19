SUMMARY = "Busybox applets containing adduser and some shadow tools"
DESCRIPTION = "This package contains the symlinks for adduser and some tools from the \
shadow suite."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-adduser-1.38.0-42.2.noarch.rpm"
RPM_HASH = "d693435543670036d8ecd446ab6d5e0adac9db9d113d73da4a2ec3fdedb895c6ac9f8e58b612f068108fb8cb9d16863d994ea88645c37511e42039140fa7c309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-adduser"

RDEPENDS:${PN} += "busybox \
group-nogroup"

inherit rpm
