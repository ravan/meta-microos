SUMMARY = "Translations for package wayfire-plugins-extra"
DESCRIPTION = "Provides translations for the 'wayfire-plugins-extra' package."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "wayfire-plugins-extra-lang-0.11.2-1.1.noarch.rpm"
RPM_HASH = "55e23cb9b98480e69e70ed07370b1e331e476c71c748e4ec1519dcdcdba95db6fd9615c41d10cd655bc99cb4c850c3c7abd09f11e280055ab7f716370615694d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wayfire-plugins-extra-es-ES \
locale-wayfire-plugins-extra-ro \
locale-wayfire-plugins-extra-zh-CN \
wayfire-plugins-extra-lang \
wayfire-plugins-extra-lang-all"

RDEPENDS:${PN} += "wayfire-plugins-extra"

inherit rpm
