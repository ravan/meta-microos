SUMMARY = "Monospace terminal fonts from Microsoft"
DESCRIPTION = "Cascadia Code is a monospaced font that was designed also with Visual Studio / Visual Studio Code in mind."
LICENSE = "OFL-1.1"

PV = "2407.24"

RPM_NAME = "saja-cascadia-code-fonts-2407.24-1.4.noarch.rpm"
RPM_HASH = "2a41dd092b2a9c70911b972c42d0ac0b8e30eea9ddc431fc139c2317680fbe4f564588bc6752c04f1393973272cd57847cfd0f15ef20ae7e70ef1f1168a89077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saja-cascadia-code-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
