SUMMARY = "Development files for the Hawk Network Library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of hawknl."
LICENSE = "LGPL-2.1+"

PV = "1.6.8"

RPM_NAME = "hawknl-devel-1.6.8-1.35.aarch64.rpm"
RPM_HASH = "06d5a05dc46fff63f3b49a4150e8e3843cf4836922624ee3159da820edcbb76372f0af928e29c0770e32ab087ebe9fc29e660b665d58f3637041b1b41faf2d7d"

RPROVIDES:${PN} += "hawknl-devel"

RDEPENDS:${PN} += "hawknl-libs"

inherit rpm
