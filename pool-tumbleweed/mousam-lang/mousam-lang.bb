SUMMARY = "Translations for package mousam"
DESCRIPTION = "Provides translations for the 'mousam' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "mousam-lang-2.0.2-1.2.noarch.rpm"
RPM_HASH = "dcc696a5056d0acab8d048fae9b2b24cf91a04d94890ab1e67459b1bf3094ff9999338fd685ad7cbf7eb2acfd792832dfc8fc4b7fcff6f1b25744019e9d50f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mousam-cs \
locale-mousam-de \
locale-mousam-es \
locale-mousam-fr \
locale-mousam-hi \
locale-mousam-hu \
locale-mousam-it \
locale-mousam-ko \
locale-mousam-nl \
locale-mousam-pl \
locale-mousam-pt-BR \
locale-mousam-ro \
locale-mousam-ru \
locale-mousam-th \
locale-mousam-tr \
locale-mousam-uk \
locale-mousam-zh-CN \
locale-mousam-zh-TW \
mousam-lang \
mousam-lang-all"

RDEPENDS:${PN} += "mousam"

inherit rpm
