SUMMARY = "Adapta Telegram themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains Telegram themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "telegram-theme-adapta-3.95.0.11-5.4.aarch64.rpm"
RPM_HASH = "c5ee72239ab60a8ab344d1ffa181e3a9c7c725bbd62147ec02ba83ecac3a003a99d2892f875839b71b46001078afa3e71016ab329938ea7c3f452b685ca21dfa"

RPROVIDES:${PN} += "telegram-theme-adapta"

RDEPENDS:${PN} += "metatheme-adapta-common \
telegram-desktop"

inherit rpm
