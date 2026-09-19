SUMMARY = "An input completion utility"
DESCRIPTION = "Ibus-typing-booster is a context sensitive completion \
input method to speedup typing."
LICENSE = "GPL-3.0-or-later"

PV = "2.31.0"

RPM_NAME = "ibus-typing-booster-2.31.0-1.1.aarch64.rpm"
RPM_HASH = "26bdbbdb5394606492035a15e237ad8d376f2023345c70907ffea87a00e80553234f5dcc95475b949e8cf51ad22450a9cde722fa6fcbf2e67a2978ddd41b350f"

RPROVIDES:${PN} += "ibus-typing-booster"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1-python3 \
enchant-1-backend \
ibus \
m17n-lib \
python3 \
python3-distro \
python3-pyenchant \
python3-pyxdg"

inherit rpm
