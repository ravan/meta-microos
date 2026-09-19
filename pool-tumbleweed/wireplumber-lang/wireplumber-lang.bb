SUMMARY = "Translations for package wireplumber"
DESCRIPTION = "Provides translations for the 'wireplumber' package."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-lang-0.5.17-1.1.noarch.rpm"
RPM_HASH = "809dff6d10c866389d62b75ad0c97eb378c097d8dda1ebbc49c62a51a64eac33592be691d58868e863322d77889441ecc58051c1ada340bc7229107169f5b91a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wireplumber-af \
locale-wireplumber-as \
locale-wireplumber-be \
locale-wireplumber-bg \
locale-wireplumber-bn-IN \
locale-wireplumber-ca \
locale-wireplumber-cs \
locale-wireplumber-da \
locale-wireplumber-de \
locale-wireplumber-de-CH \
locale-wireplumber-el \
locale-wireplumber-eo \
locale-wireplumber-es \
locale-wireplumber-fa \
locale-wireplumber-fi \
locale-wireplumber-fr \
locale-wireplumber-gl \
locale-wireplumber-gu \
locale-wireplumber-he \
locale-wireplumber-hi \
locale-wireplumber-hr \
locale-wireplumber-hu \
locale-wireplumber-id \
locale-wireplumber-it \
locale-wireplumber-ja \
locale-wireplumber-ka \
locale-wireplumber-kk \
locale-wireplumber-kn \
locale-wireplumber-ko \
locale-wireplumber-lt \
locale-wireplumber-ml \
locale-wireplumber-mr \
locale-wireplumber-nl \
locale-wireplumber-nn \
locale-wireplumber-oc \
locale-wireplumber-or \
locale-wireplumber-pa \
locale-wireplumber-pl \
locale-wireplumber-pt \
locale-wireplumber-pt-BR \
locale-wireplumber-ro \
locale-wireplumber-ru \
locale-wireplumber-si \
locale-wireplumber-sk \
locale-wireplumber-sl \
locale-wireplumber-sr \
locale-wireplumber-sr@latin \
locale-wireplumber-sv \
locale-wireplumber-ta \
locale-wireplumber-te \
locale-wireplumber-tr \
locale-wireplumber-uk \
locale-wireplumber-zh-CN \
locale-wireplumber-zh-TW \
wireplumber-lang \
wireplumber-lang-all"

RDEPENDS:${PN} += "wireplumber"

inherit rpm
