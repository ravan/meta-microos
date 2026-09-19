SUMMARY = "Translations for package calcurse"
DESCRIPTION = "Provides translations for the 'calcurse' package."
LICENSE = "BSD-2-Clause"

PV = "4.8.2"

RPM_NAME = "calcurse-lang-4.8.2-1.6.noarch.rpm"
RPM_HASH = "e3a227d4413e944b0f481fa74867173bb321e2c7ef0bb004a0153d7ebbb8bb04cfa7805fd2124d94314217fc19ba85b335d5c07d2018f4112e2eadd1516e3963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calcurse-lang \
calcurse-lang-all \
locale-calcurse-de \
locale-calcurse-en-US \
locale-calcurse-es \
locale-calcurse-fr \
locale-calcurse-nl \
locale-calcurse-pt-BR \
locale-calcurse-ru"

RDEPENDS:${PN} += "calcurse"

inherit rpm
