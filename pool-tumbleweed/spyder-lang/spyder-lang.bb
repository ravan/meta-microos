SUMMARY = "Translations for package spyder"
DESCRIPTION = "Provides translations for the 'spyder' package."
LICENSE = "MIT"

PV = "6.1.5"

RPM_NAME = "spyder-lang-6.1.5-1.2.noarch.rpm"
RPM_HASH = "e77bbec5ad8cdd81599f964512a833b6758e74b2db9dbce4d9a6bcfa42aa34ad3e39825ad734d60de0503772250907c41c18415ed143d463b9409df507f138cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spyder-de \
locale-spyder-es \
locale-spyder-fr \
locale-spyder-hu \
locale-spyder-ja \
locale-spyder-pl \
locale-spyder-pt-BR \
locale-spyder-ru \
locale-spyder-zh-CN \
spyder-lang \
spyder-lang-all \
spyder3-lang"

RDEPENDS:${PN} += "spyder"

inherit rpm
