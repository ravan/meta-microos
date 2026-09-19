SUMMARY = "Static version of qrupdate library"
DESCRIPTION = "This package contains the static version of the qrupdate libraries."
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-static-1.1.2-3.41.aarch64.rpm"
RPM_HASH = "baaee68e92f0443154eb28d0e63fd63be60714c180df25ea82c9730f3fa4cb7f1ea32e9866ae154329325bb9ecf71c6794c986f71190ed869837ac00281973a6"

RPROVIDES:${PN} += "qrupdate-static"

RDEPENDS:${PN} += ""

inherit rpm
