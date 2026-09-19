SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "skelcd-installer-net-openSUSE-17.178-1.9.aarch64.rpm"
RPM_HASH = "1efc13f180dd32c95ce5fb1585779e66313fa1207dec21b47a3b35f05f17e40b9dbe2f8227bb7fa293169a9de225116da969020498acd8caddb1371ea22a62ad"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
