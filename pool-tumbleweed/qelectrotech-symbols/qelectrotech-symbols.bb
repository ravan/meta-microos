SUMMARY = "Elements collection for QElectroTech"
DESCRIPTION = "This packages contains the elements collection for the electronic \
components used in the QElectroTech application."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.100"

RPM_NAME = "qelectrotech-symbols-0.100-1.3.noarch.rpm"
RPM_HASH = "ae5347e959620953533e8a0379ff711c8ae34dca0aee5ecf8a2c93358ee98d59d0f88a8403f26eb5df8c56442831012d59cb052def728505409a5c56bc5b3d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qelectrotech-symbols"

RDEPENDS:${PN} += "qelectrotech"

inherit rpm
