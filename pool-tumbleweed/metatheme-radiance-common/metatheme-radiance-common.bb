SUMMARY = "Radiance Gtk Theme -- Common Files"
DESCRIPTION = "Includes an Radiance dark-on-light theme. \
 \
Introduced as one of the defaults in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "metatheme-radiance-common-20.10-2.10.noarch.rpm"
RPM_HASH = "a036fa782fc2bf17b9d8bd0e1e2103f5108ac75c962cd5053010ac6a1e8ff701a36637258f0a13e1674572131fa3a47f610a821f11ace1fa95c671eef68ea294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-radiance-common"

RDEPENDS:${PN} += ""

inherit rpm
