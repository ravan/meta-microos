SUMMARY = "Translations for package featherpad"
DESCRIPTION = "Provides translations for the 'featherpad' package."
LICENSE = "GPL-3.0-only"

PV = "1.6.4"

RPM_NAME = "featherpad-lang-1.6.4-1.2.noarch.rpm"
RPM_HASH = "9c09ebb1baecb47f238f091571524ae769287c66018b575020e2c75d6bda17cd6583479e02041379f0e71390bec9d5daffd7fcbfc90f15fb46b300c12ed18d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "featherpad-lang \
featherpad-lang-all"

RDEPENDS:${PN} += "featherpad"

inherit rpm
