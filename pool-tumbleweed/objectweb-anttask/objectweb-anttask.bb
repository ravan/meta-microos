SUMMARY = "ObjectWeb Ant task"
DESCRIPTION = "ObjectWeb Ant task"
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "objectweb-anttask-1.2-265.9.noarch.rpm"
RPM_HASH = "18a17a8bb36e5d964a0abca113ca4db5ee78507c6f38d54386d49fbaf76114d3af29064c56accd77a5d0e11cb011c35f18be3637165b806724b5159a0940ebaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objectweb-anttask \
owanttask"

RDEPENDS:${PN} += ""

inherit rpm
