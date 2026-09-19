SUMMARY = "A identity management service and clients."
DESCRIPTION = "An identity management platform written in rust that supports RADIUS, SSH Key management \
and more."
LICENSE = "( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | ISC | MIT ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-with-LLVM-exception | Apache-2.0 | MIT ) & ( CC0-1.0 | Apache-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MPL-2.0 & MPL-2.0+"

PV = "1.10.4~git0.97b1edbc4"

RPM_NAME = "kanidm-1.10.4~git0.97b1edbc4-1.2.aarch64.rpm"
RPM_HASH = "87d1887974c260947dd7aa34f1e8ac9e82656123310e09f6336476c55ae7e6e500bbb89b45261cd22dfe8de0e1c80b15d333bdfbc020d70905c88c2304ba3d7a"

RPROVIDES:${PN} += "kanidm"

RDEPENDS:${PN} += "kanidm-clients \
kanidm-unixd-clients"

inherit rpm
