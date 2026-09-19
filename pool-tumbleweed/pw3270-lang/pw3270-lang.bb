SUMMARY = "Translations for package pw3270"
DESCRIPTION = "Provides translations for the 'pw3270' package."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "pw3270-lang-5.5.0+git20241211-3.6.noarch.rpm"
RPM_HASH = "4f1a5f7aeb50ae3edcb1a22639f691d3e6e018aecadd62ad1a28b466a1b17f3a165cb2a207912acb5ae90393d97ff86a0b6b8a903b1fe645057bfd2c73b5b1f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pw3270-pt-BR \
pw3270-lang \
pw3270-lang-all"

RDEPENDS:${PN} += "pw3270"

inherit rpm
