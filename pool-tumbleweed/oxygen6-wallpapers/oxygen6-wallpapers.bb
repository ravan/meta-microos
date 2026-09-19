SUMMARY = "Oxygen wallpapers"
DESCRIPTION = "This package provides Oxygen wallpapers."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-wallpapers-6.7.5-1.1.noarch.rpm"
RPM_HASH = "d0d88c0d694767493e4f486d75c76f768a257f5a763f069a334a486af2d88b6ed2e49ef061e514dad1f0578482f8cdfcb5accebb01213cd4de667822a2fdc7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen6-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
