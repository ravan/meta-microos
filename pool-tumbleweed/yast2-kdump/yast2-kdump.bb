SUMMARY = "Configuration of kdump"
DESCRIPTION = "Configuration of kdump"
LICENSE = "GPL-2.0-only"

PV = "5.0.7"

RPM_NAME = "yast2-kdump-5.0.7-1.2.aarch64.rpm"
RPM_HASH = "2fcc504d7302637128a9b610a770af9f13e241526b646bc998fce516baa042dc842c81414802270f7652eca5209c94c27a3104d60071a424c5314b18d1ff8c0f"

RPROVIDES:${PN} += "yast2-kdump"

RDEPENDS:${PN} += "yast2 \
yast2-bootloader \
yast2-packager \
yast2-ruby-bindings"

inherit rpm
