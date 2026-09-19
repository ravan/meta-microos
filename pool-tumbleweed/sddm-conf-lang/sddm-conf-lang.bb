SUMMARY = "Translations for package sddm-conf"
DESCRIPTION = "Provides translations for the 'sddm-conf' package."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "sddm-conf-lang-0.4.1-1.2.noarch.rpm"
RPM_HASH = "f3c8cac4a2f9716890b25e8d60df4e95ceb4d91ea75a2673788f6db3bb42ea7da61f85c563f97dd995770e2d25b86ee9c702d010e07ebdb5a404aa7b5a8f0d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-conf-lang \
sddm-conf-lang-all"

RDEPENDS:${PN} += "sddm-conf"

inherit rpm
