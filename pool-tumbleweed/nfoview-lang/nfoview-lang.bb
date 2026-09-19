SUMMARY = "Translations for package nfoview"
DESCRIPTION = "Provides translations for the 'nfoview' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.99"

RPM_NAME = "nfoview-lang-1.99-1.11.noarch.rpm"
RPM_HASH = "656be09c2ec4e959dc9f7bf37e12fcfdf5357bed3c491b61877fbe960addedc6e8f63479b897fe3694df2ad9295f428dce90473a7d625980269d68264fc002ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nfoview-bg \
locale-nfoview-br \
locale-nfoview-cs \
locale-nfoview-de \
locale-nfoview-de-CH \
locale-nfoview-el \
locale-nfoview-es-ES \
locale-nfoview-fi \
locale-nfoview-fr \
locale-nfoview-he \
locale-nfoview-hu \
locale-nfoview-it \
locale-nfoview-ka \
locale-nfoview-nl \
locale-nfoview-pl \
locale-nfoview-pt-BR \
locale-nfoview-pt-PT \
locale-nfoview-ro \
locale-nfoview-ru \
locale-nfoview-sr \
locale-nfoview-sv \
locale-nfoview-tr \
locale-nfoview-zh-CN \
nfoview-lang \
nfoview-lang-all"

RDEPENDS:${PN} += "nfoview"

inherit rpm
