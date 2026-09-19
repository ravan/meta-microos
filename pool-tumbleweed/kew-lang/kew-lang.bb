SUMMARY = "Translations for package kew"
DESCRIPTION = "Provides translations for the 'kew' package."
LICENSE = "GPL-2.0-only"

PV = "4.2.7"

RPM_NAME = "kew-lang-4.2.7-1.2.noarch.rpm"
RPM_HASH = "f280137cbf88d18b99822dc3677518ff3a9716622fdadeee7bec21fc0c9472b0d2e04bb2d9218a750eb7f040d6b0779c9122c7880bff10300c5ff127cfbae5fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kew-lang \
kew-lang-all \
locale-kew-ja \
locale-kew-zh-CN"

RDEPENDS:${PN} += "kew"

inherit rpm
