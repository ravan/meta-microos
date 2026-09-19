SUMMARY = "Translations for package curtail"
DESCRIPTION = "Provides translations for the 'curtail' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.1"

RPM_NAME = "curtail-lang-1.16.1-1.2.noarch.rpm"
RPM_HASH = "59f2ed5de24d1d4de2348dab2895fe1d3c5bb2702a0e9ae97be7a47693103d0c1cd5b2dce10f6cd1259a0bcc9bf1015fe34e35c03795d3f34290743d254cf113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "curtail-lang \
curtail-lang-all \
locale-curtail-az \
locale-curtail-bg \
locale-curtail-ca \
locale-curtail-cs \
locale-curtail-de \
locale-curtail-el \
locale-curtail-en-GB \
locale-curtail-eo \
locale-curtail-es \
locale-curtail-eu \
locale-curtail-fr \
locale-curtail-gl \
locale-curtail-he \
locale-curtail-hi \
locale-curtail-hr \
locale-curtail-hu \
locale-curtail-ia \
locale-curtail-id \
locale-curtail-it \
locale-curtail-ka \
locale-curtail-kk \
locale-curtail-ko \
locale-curtail-nb \
locale-curtail-nl \
locale-curtail-oc \
locale-curtail-pl \
locale-curtail-pt \
locale-curtail-pt-BR \
locale-curtail-ro \
locale-curtail-ru \
locale-curtail-sk \
locale-curtail-sl \
locale-curtail-sr \
locale-curtail-sv \
locale-curtail-tr \
locale-curtail-uk \
locale-curtail-zh-CN"

RDEPENDS:${PN} += "curtail"

inherit rpm
