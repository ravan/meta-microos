SUMMARY = "Translations for package Srain"
DESCRIPTION = "Provides translations for the 'Srain' package."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.8.1"

RPM_NAME = "Srain-lang-1.8.1-1.5.noarch.rpm"
RPM_HASH = "26fe89aac874cd9b0d1ba0aebdf941b5f5f3d737ddaf1b28e8f5ce6eaa26a1bb3167911d7b9657c93b3a510104a870120a327b8d82ce3281f0791b3281969823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Srain-lang \
Srain-lang-all \
locale-Srain-fr \
locale-Srain-nl \
locale-Srain-ru \
locale-Srain-uk \
locale-Srain-zh-CN \
locale-Srain-zh-TW"

RDEPENDS:${PN} += "Srain"

inherit rpm
