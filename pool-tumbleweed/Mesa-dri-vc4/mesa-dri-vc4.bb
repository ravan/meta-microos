SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-dri-vc4-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "a4c90f5fc30ff6c26ccbf962387bd72d4e6412f3e22520d1ed010812e971ab1a11ef70517168e541c235537949d706aa1ff23212ccd47c5b32324602e1506d70"

RPROVIDES:${PN} += "Mesa-dri-vc4"

RDEPENDS:${PN} += "Mesa"

inherit rpm
