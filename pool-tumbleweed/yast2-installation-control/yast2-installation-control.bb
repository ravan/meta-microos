SUMMARY = "YaST2 - RNG schema for installation control files"
DESCRIPTION = "This package contains RNG schema for validating the installation control files."
LICENSE = "GPL-2.0-only"

PV = "5.0.3"

RPM_NAME = "yast2-installation-control-5.0.3-1.4.noarch.rpm"
RPM_HASH = "d60fe60518393f7e75067dbd714a8f6dc3cfbc0de6edc886cb9aa12b120347e58a4117aefd9c06ec7119bb8be59dc6991b433cea4ef09616640ad99be9205685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-skelcd-control-datadir \
yast2-installation-control"

RDEPENDS:${PN} += ""

inherit rpm
