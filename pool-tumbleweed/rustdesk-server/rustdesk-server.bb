SUMMARY = "RustDesk Server Program"
DESCRIPTION = "Self-host your own RustDesk server."
LICENSE = "AGPL-3.0-only"

PV = "1.1.16"

RPM_NAME = "rustdesk-server-1.1.16-2.3.aarch64.rpm"
RPM_HASH = "6c0cbdbe3bc7fa2d8281dccf7a7a05350c13f07b9e627944263acec82cae588e050496c6cf275c253672ce125880346ff45dc65d133b55428241ae453093c74c"

RPROVIDES:${PN} += "rustdesk-server"

RDEPENDS:${PN} += "rustdesk-server-hbbr \
rustdesk-server-hbbs \
rustdesk-server-utils \
system-user-rustdesk"

inherit rpm
