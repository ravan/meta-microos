SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-MicroOS-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "dc1e2e9fc6661182211584e5b841f72460fe0094dbe8fc7abacd0de00d76779dc2d15957488b804cd6dde827195085e252e93e45c9149e3a1bfbd2143b21d290"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
