SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knewstuff-core-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "0e83695cabf87152d26c8bbcec88b697ff548fca117cbc26cd6aef5fab9e81c68c290e1ce41310642f6a2536b0952e56a81bf75ab995bc70976f64e28ee2f400"

RPROVIDES:${PN} += "cmake-KF5NewStuffCore \
knewstuff-core-devel"

RDEPENDS:${PN} += "cmake-KF5Attica \
libKF5NewStuffCore5"

inherit rpm
