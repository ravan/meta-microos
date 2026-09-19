SUMMARY = "Support for Cloud"
DESCRIPTION = "Packages required to enable openSUSE MicroOS in the Cloud."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cloud-5.0-111.1.aarch64.rpm"
RPM_HASH = "d0d230c256676aba83ef88ad51426ae75af58f5dc63a037493e86f2f20f4daf967ddcdec6c36fb03ff452db8b665ebc2286d3875657f38cfdbcf565bcf9f00f8"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-cloud"

RDEPENDS:${PN} += "cloud-init \
cloud-init-config-MicroOS"

inherit rpm
