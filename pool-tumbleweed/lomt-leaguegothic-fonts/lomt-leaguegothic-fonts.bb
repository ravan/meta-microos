SUMMARY = "League Of Movable Type's 'League Gothic' font family"
DESCRIPTION = "League Gothic is a revival of an old classic, Alternate Gothic #1."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-leaguegothic-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "c77069eca555b9c226ce560297d758051c088d715f18a32e2bd422e8517be61df6ae703d120983c9c9257e9841a772fbaea41a952b99478734edce56d03f54bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-leaguegothic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
