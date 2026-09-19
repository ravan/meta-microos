SUMMARY = "Development files for opentimelineio"
DESCRIPTION = "Development files for opentimelineio."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "opentimelineio-devel-0.18.0-1.6.aarch64.rpm"
RPM_HASH = "aa529a3345f3ac57593809a0940c2b57d0f2481723db49362420c02ae884dbf3429a519be03648012fff938f5f3143a27bcafd9eb27c944fb50f3d28031df4f2"

RPROVIDES:${PN} += "cmake-OpenTime \
cmake-OpenTimelineIO \
opentimelineio-devel"

RDEPENDS:${PN} += "Imath-devel \
libopentimelineio18"

inherit rpm
