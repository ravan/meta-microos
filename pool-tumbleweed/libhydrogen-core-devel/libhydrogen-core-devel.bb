SUMMARY = "Development files and headers for libhydrogen-core"
DESCRIPTION = "These are the headers needed to develop apps that \
link with libhydrogen-core."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libhydrogen-core-devel-1.2.6-1.6.noarch.rpm"
RPM_HASH = "05e32e4b8bfc8eef776dbcc259d813d892cfc29537a22318b042349dc1adad8c193fc0aa9b143691d11497be7cecc72bf8f5517fa2b3d61b3788de7800a8e784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libhydrogen-core-devel"

RDEPENDS:${PN} += "libhydrogen-core-1-2-6"

inherit rpm
