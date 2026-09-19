SUMMARY = "Translations for package fldigi"
DESCRIPTION = "Provides translations for the 'fldigi' package."
LICENSE = "GPL-3.0-only"

PV = "4.2.13"

RPM_NAME = "fldigi-lang-4.2.13-1.1.noarch.rpm"
RPM_HASH = "5b7b70947d40b424e5d455048dc584c57233dcdbf0af12201406533b11810704f296aebd15412722508c1bf433951b2dff290387092a99535cf0d2ca3d0724ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fldigi-lang \
fldigi-lang-all \
locale-fldigi-ca \
locale-fldigi-de \
locale-fldigi-el \
locale-fldigi-es \
locale-fldigi-fr \
locale-fldigi-it \
locale-fldigi-nl \
locale-fldigi-pl \
locale-fldigi-ru"

RDEPENDS:${PN} += "fldigi"

inherit rpm
