SUMMARY = "Development files for espeak-ng"
DESCRIPTION = "This package contains development files for espeak-ng."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.52.0"

RPM_NAME = "espeak-ng-devel-1.52.0-2.6.aarch64.rpm"
RPM_HASH = "cf70c47f869df9c8d018871aa59077c7e59ac378cb518bb375a8009d9c63eb8655cacfa43ce3eab2a42f6b67d128371ad91f31b9a57df8c162084798c18eda19"

RPROVIDES:${PN} += "espeak-ng-devel \
pkgconfig-espeak-ng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libespeak-ng1"

inherit rpm
