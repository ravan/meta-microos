SUMMARY = "Translations for package help2man"
DESCRIPTION = "Provides translations for the 'help2man' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.49.3"

RPM_NAME = "help2man-lang-1.49.3-1.17.noarch.rpm"
RPM_HASH = "fc1d9777b4f2e8a8bd5530f76aa3c117e296e0307ee342976cbe0ff0fa87a220cb1b5fc3e6cd554fdd1ed9fd621a7e1c17f3e981d95ca937e1e93d47f11f1898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "help2man-lang \
help2man-lang-all \
locale-help2man-da \
locale-help2man-de \
locale-help2man-el \
locale-help2man-eo \
locale-help2man-es \
locale-help2man-fi \
locale-help2man-fr \
locale-help2man-hr \
locale-help2man-hu \
locale-help2man-it \
locale-help2man-ja \
locale-help2man-ko \
locale-help2man-nb \
locale-help2man-pl \
locale-help2man-pt-BR \
locale-help2man-ro \
locale-help2man-ru \
locale-help2man-sr \
locale-help2man-sv \
locale-help2man-ta \
locale-help2man-uk \
locale-help2man-vi \
locale-help2man-zh-CN"

RDEPENDS:${PN} += "help2man"

inherit rpm
