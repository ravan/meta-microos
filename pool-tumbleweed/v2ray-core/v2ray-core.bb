SUMMARY = "Network tools for building a computer network"
DESCRIPTION = "Project V is a set of network tools for building a computer network. \
It secures network connections and protects privacy."
LICENSE = "MIT"

PV = "5.53.0"

RPM_NAME = "v2ray-core-5.53.0-2.1.aarch64.rpm"
RPM_HASH = "c1291f5eb44bea8aebc02179982f86bcb86f7188bdaf8ec6872631be0a41c54d71c86c35ad557fd4fd55a9f18833076d272fd50a582d75f895a9b29846da22d1"

RPROVIDES:${PN} += "v2ray \
v2ray-core"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
