SUMMARY = "Translations for package ModemManager"
DESCRIPTION = "Provides translations for the 'ModemManager' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.24.2"

RPM_NAME = "ModemManager-lang-1.24.2-1.6.noarch.rpm"
RPM_HASH = "ced7d6410175cc74ce56116fcae3a97491bf27b4e9fc72c699be3a8fc055486a3cada4e3d74c0e410e1d2ac39669a8ec7481593a83055371ae367369a9948aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ModemManager-lang \
ModemManager-lang-all \
locale-ModemManager-ca \
locale-ModemManager-cs \
locale-ModemManager-da \
locale-ModemManager-de \
locale-ModemManager-fi \
locale-ModemManager-fr \
locale-ModemManager-fur \
locale-ModemManager-gl \
locale-ModemManager-he \
locale-ModemManager-hu \
locale-ModemManager-id \
locale-ModemManager-it \
locale-ModemManager-ka \
locale-ModemManager-lt \
locale-ModemManager-nl \
locale-ModemManager-pl \
locale-ModemManager-pt-BR \
locale-ModemManager-ru \
locale-ModemManager-sk \
locale-ModemManager-sv \
locale-ModemManager-tr \
locale-ModemManager-uk \
locale-ModemManager-zh-CN"

RDEPENDS:${PN} += "ModemManager"

inherit rpm
