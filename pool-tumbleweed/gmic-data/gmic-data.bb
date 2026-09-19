SUMMARY = "Shared data files for the various gmic frontends"
DESCRIPTION = "This package contains shared data files for the various gmic frontends."
LICENSE = "CECILL-2.1"

PV = "4.0.3"

RPM_NAME = "gmic-data-4.0.3-1.2.noarch.rpm"
RPM_HASH = "f8a583acc23448b15c797d89f9aa6e3e056f9424b71f2af1d2fb4202f9484b81473d246de66ecd2c425a1e5cdea17c1948ea76262b23f89aea3a13896ac942ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-data"

RDEPENDS:${PN} += ""

inherit rpm
