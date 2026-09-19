SUMMARY = "Ambiance Gtk Theme -- Common Files"
DESCRIPTION = "Includes an Ambiance light-on-dark theme. \
 \
Introduced as the default theme in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "metatheme-ambiance-common-20.10-2.10.noarch.rpm"
RPM_HASH = "850fb2000a16c4650ab51a4d0b93a5cc07cf0ce0eb98decbf88afb8b261ddf58c7c17541ed397905ba5b94855dbbd1c14ff295e0b21724831321ce8643d075f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-ambiance-common"

RDEPENDS:${PN} += ""

inherit rpm
