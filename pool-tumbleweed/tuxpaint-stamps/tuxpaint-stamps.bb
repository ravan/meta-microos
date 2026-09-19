SUMMARY = "Rubber stamps collection for Tux Paint"
DESCRIPTION = "This package contains the documentation for the 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "538a3c5380a67b66aec63ab55534a371cb4568972a640e4f26a5f09f7a20ff0c8787c2caf0426d0a4ed0c588b1e887fe7df5cfd5506fdebad7281980ebb1cbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps"

RDEPENDS:${PN} += "tuxpaint-stamps-category"

inherit rpm
