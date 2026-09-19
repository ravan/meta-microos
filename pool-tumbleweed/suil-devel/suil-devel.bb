SUMMARY = "Development files for the suil library"
DESCRIPTION = "Development files needed to build applications against suil library."
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "suil-devel-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "e391e709340cf2e522bb907eb4eb348a6c4e1376c181ced9bb9d504e5b974e28ea3633761c415b44eb9e53f94436b491bf1d01e6f98cd711efe97a3f332307cd"

RPROVIDES:${PN} += "pkgconfig-suil-0 \
suil-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsuil-0-0 \
pkgconfig \
pkgconfig-lv2"

inherit rpm
