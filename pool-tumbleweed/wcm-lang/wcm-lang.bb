SUMMARY = "Translations for package wcm"
DESCRIPTION = "Provides translations for the 'wcm' package."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wcm-lang-0.11.0-1.1.noarch.rpm"
RPM_HASH = "33f71094e5db93065f3921adbcc90252cb2c48f5803ca303f0b2ece39fad472996583cc2490439759f8218ac657b8e53ec74e41e26e259fbce211bacfe6bd777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wcm-es-ES \
locale-wcm-ro \
locale-wcm-zh-CN \
wcm-lang \
wcm-lang-all"

RDEPENDS:${PN} += "wcm"

inherit rpm
