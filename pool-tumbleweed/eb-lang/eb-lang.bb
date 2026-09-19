SUMMARY = "Translations for package eb"
DESCRIPTION = "Provides translations for the 'eb' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.3"

RPM_NAME = "eb-lang-4.4.3-7.5.noarch.rpm"
RPM_HASH = "07636dafcf712d3c2b5754365c3027385d0f6e605c19d5aee18fa3479c11aed6114f98b3e2ac4dbde11ec89ef765b8c0b60d42b74d98be1ec26303e58d09c284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eb-lang \
eb-lang-all \
locale-eb-ja"

RDEPENDS:${PN} += "eb"

inherit rpm
