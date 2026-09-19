SUMMARY = "Translations for package usbauth-notifier"
DESCRIPTION = "Provides translations for the 'usbauth-notifier' package."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "usbauth-notifier-lang-1.0.4-2.10.noarch.rpm"
RPM_HASH = "f9eb95e5465fc2c73247c6dbaa1b9f5b5ed72e85dabb689640d94c0df1c7e5907cdad090c7b9943edd6a57900a35a9034cd9412c03c5b1effcb11f8f8aec86d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-usbauth-notifier-de \
locale-usbauth-notifier-zh-TW \
usbauth-notifier-lang \
usbauth-notifier-lang-all"

RDEPENDS:${PN} += "usbauth-notifier"

inherit rpm
