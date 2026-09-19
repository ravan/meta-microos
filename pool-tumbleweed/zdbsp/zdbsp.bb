SUMMARY = "Nodebuilder for ZDoom"
DESCRIPTION = "ZDBSP is ZDoom's (internal and external) node builder. This node \
builder was written with two design goals in mind: speed and \
minimization of polyobject bleeding."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "zdbsp-1.19-3.5.aarch64.rpm"
RPM_HASH = "72e5fea7bd3bc42b351a8c89859c05101e7896f4156d0bc5524047c0c28135cbe7c9e0bc77cd2787043614c56172b53f87152b475d4c631fd7a0d918234f65ab"

RPROVIDES:${PN} += "zdbsp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
