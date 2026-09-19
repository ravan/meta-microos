SUMMARY = "Development files for liblms7compact"
DESCRIPTION = "Compact LMS7002 library suitable for MCU. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblms7compact."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20200518"

RPM_NAME = "liblms7002m-devel-0.0.0+git.20200518-2.9.aarch64.rpm"
RPM_HASH = "bd8dfe79bd2e43c8e522abf1a08f7b03258c11e60471738c56c3f4b5ac44f27ede648d339f92b3a3065c4239ad8a9bd88585b95603ae265a333ea06bdb3e1adc"

RPROVIDES:${PN} += "liblms7002m-devel"

RDEPENDS:${PN} += "liblms7compact0"

inherit rpm
