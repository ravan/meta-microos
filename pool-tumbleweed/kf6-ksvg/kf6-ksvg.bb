SUMMARY = "Components for handling SVGs"
DESCRIPTION = "Components for handling SVGs"
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ksvg-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "169009cec36a26fd268f190993d5bde81425fb7596e9b2e78af0282cb9c36b0b61139ee208e126186894483b062a0ff486c3f0467acffd96cb56893710e2375d"

RPROVIDES:${PN} += "kf6-ksvg"

RDEPENDS:${PN} += "kf6-kirigami-imports"

inherit rpm
