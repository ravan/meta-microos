SUMMARY = "Jyutping input method"
DESCRIPTION = "ibus-table-jyutping provides the Jyutping input method on IBus Table under \
the IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-jyutping-1.8.14-1.6.noarch.rpm"
RPM_HASH = "691015ea58d8574bd1f7985ceef39ef4a6a63e618f0b6cd6596ce51edb14406a0b5ba0facdf36753d7824fec3e7ab77ff166ab2133934d95d63b149e7a7861a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-jyutping \
ibus-table-jyutping \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
