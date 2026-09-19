SUMMARY = "Configuration of isns"
DESCRIPTION = "-"
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-isns-5.0.1-1.2.noarch.rpm"
RPM_HASH = "0c7a11351de1bcd1e2b14211f9b810b4e1c739d88a1b01d28ae85b6f0ff063c1162de84d9b46bd9d9af88baa3340649574bbe595cd0be3fabe25a0849ae5e6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-isns"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
