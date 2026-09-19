SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kinit-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "ebe6ebed7c1918c36b814ec8d8be25fd4338e16d1017c8960542532767da5cf52098818125e08403f2ab5600bfa9c5231627fc191f3da306517d00915ce2ab6c"

RPROVIDES:${PN} += "cmake-KF5Init \
kinit-devel"

RDEPENDS:${PN} += ""

inherit rpm
