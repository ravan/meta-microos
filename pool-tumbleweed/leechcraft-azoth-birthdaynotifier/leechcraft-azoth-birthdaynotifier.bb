SUMMARY = "LeechCraft Azoth Birthday Notifier Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with which you \
will be notified of your contacts' birthdays if they are present in \
vCards."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-birthdaynotifier-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3bbe296c55c1f78669491485e3c55bd519235b452e79205c8e80fe35b245fa094228a98972d09c228228ef1fe14c5b5f484b9559230d8b7237cb50a53a62be2e"

RPROVIDES:${PN} += "leechcraft-azoth-birthdaynotifier \
libleechcraft-azoth-birthdaynotifier.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
