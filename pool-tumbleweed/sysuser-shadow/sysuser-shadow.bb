SUMMARY = "Tool to execute sysusers.d with shadow utilities"
DESCRIPTION = "This package contians a tool, which expects as input a sysusers.d \
configuration file and uses the shadow suite to create the users \
and groups from it like systemd-sysusers would do."
LICENSE = "MIT"

PV = "3.3"

RPM_NAME = "sysuser-shadow-3.3-12.3.noarch.rpm"
RPM_HASH = "ed82243521367041135e526f6d26cd95649031bbb44e30427d2d145a74a9ecd01fd5ea0ab3e9db74c29c1194075715855d2d112f4a7f8e885b20fec63ed7ed5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysuser-shadow"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
