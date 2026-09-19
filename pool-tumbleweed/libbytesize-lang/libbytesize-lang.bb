SUMMARY = "Translations for package libbytesize"
DESCRIPTION = "Provides translations for the 'libbytesize' package."
LICENSE = "LGPL-2.1-only"

PV = "2.12"

RPM_NAME = "libbytesize-lang-2.12-1.6.noarch.rpm"
RPM_HASH = "4901f076dfdbc8c53728a86f8aa41776ca90f61a7d084e7d29db0ae738cf65d44ed976b4aa52cbf9879362109543d72f145489292181a425396931b8f46e6ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbytesize-lang \
libbytesize-lang-all \
locale-libbytesize-ast \
locale-libbytesize-be \
locale-libbytesize-bn-IN \
locale-libbytesize-ca \
locale-libbytesize-cs \
locale-libbytesize-da \
locale-libbytesize-de \
locale-libbytesize-es \
locale-libbytesize-fi \
locale-libbytesize-fr \
locale-libbytesize-fur \
locale-libbytesize-he \
locale-libbytesize-hr \
locale-libbytesize-hu \
locale-libbytesize-id \
locale-libbytesize-it \
locale-libbytesize-ja \
locale-libbytesize-ka \
locale-libbytesize-kk \
locale-libbytesize-ko \
locale-libbytesize-nl \
locale-libbytesize-nn \
locale-libbytesize-pl \
locale-libbytesize-pt \
locale-libbytesize-pt-BR \
locale-libbytesize-ru \
locale-libbytesize-si \
locale-libbytesize-sk \
locale-libbytesize-sq \
locale-libbytesize-sv \
locale-libbytesize-tr \
locale-libbytesize-uk \
locale-libbytesize-zh-CN \
locale-libbytesize-zh-TW"

RDEPENDS:${PN} += "libbytesize"

inherit rpm
