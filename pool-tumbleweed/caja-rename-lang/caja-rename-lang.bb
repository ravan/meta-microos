SUMMARY = "Translations for package caja-rename"
DESCRIPTION = "Provides translations for the 'caja-rename' package."
LICENSE = "GPL-3.0-or-later"

PV = "24.5.1"

RPM_NAME = "caja-rename-lang-24.5.1-1.11.noarch.rpm"
RPM_HASH = "a7f210062892ce80d8f56918fcf6ef4eb123a3e2078b00a99e767028ab534cd7bae806a972f128af746424d8d82a72cdf01a7871787c1eddf0a8b69596a6d28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-rename-lang \
caja-rename-lang-all \
locale-caja-rename-ar \
locale-caja-rename-ca \
locale-caja-rename-cs \
locale-caja-rename-de \
locale-caja-rename-el \
locale-caja-rename-en-GB \
locale-caja-rename-es \
locale-caja-rename-fr \
locale-caja-rename-hr \
locale-caja-rename-hu \
locale-caja-rename-lt \
locale-caja-rename-nb-NO \
locale-caja-rename-nl \
locale-caja-rename-oc \
locale-caja-rename-pt \
locale-caja-rename-pt-BR \
locale-caja-rename-ru \
locale-caja-rename-sl \
locale-caja-rename-tr \
locale-caja-rename-uk \
locale-caja-rename-zh-Hans"

RDEPENDS:${PN} += "caja-rename"

inherit rpm
