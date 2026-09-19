SUMMARY = "Development files for backward-cpp"
DESCRIPTION = "Development files for backward-cpp, a stack trace printer for C++."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "backward-cpp-devel-1.6-3.4.noarch.rpm"
RPM_HASH = "1996e50f5f8416853245dd356c6f84afc9b2f4afa0e228098bc6f1a38e9105dd30fb70d6b03ef90f71bb453786ead69b8c276e9589b58576530b2c884d013055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backward-cpp-devel"

RDEPENDS:${PN} += ""

inherit rpm
