SUMMARY = "Janet Project Manager"
DESCRIPTION = "JPM is the Janet Project Manager tool. It is for automating builds and downloading dependencies of Janet projects."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "jpm-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "c4e68bbe03d5845951eefe6c7a5c3f053565b78bdcb7bd6abec0c33944dd0941a75a769d00ee47a636e53f3e475c2bf0e1ad1ad44194188c758352d8d84c4b47"

RPROVIDES:${PN} += "jpm"

RDEPENDS:${PN} += "janet"

inherit rpm
