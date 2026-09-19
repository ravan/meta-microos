SUMMARY = "Development files for espeak-ng compatible with espeak"
DESCRIPTION = "This package contains development files for espeak-ng \
compatible with the original espeak."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.52.0"

RPM_NAME = "espeak-ng-compat-devel-1.52.0-2.6.aarch64.rpm"
RPM_HASH = "8075b47a644cb7263b67379477ea4ff1586b2bfa3f04b9bd92f274bb08c52f1d79cf73b056fe89d359c9371c115846f10fcbc765089e4bf821ff97987bdba948"

RPROVIDES:${PN} += "espeak-ng-compat-devel"

RDEPENDS:${PN} += "espeak-ng-compat \
espeak-ng-devel \
libespeak-ng1"

inherit rpm
