SUMMARY = "Translations for package tar"
DESCRIPTION = "Provides translations for the 'tar' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.35"

RPM_NAME = "tar-lang-1.35-10.1.noarch.rpm"
RPM_HASH = "3546b19aa75a52ddac8db51fecd3976c274e8698a622d59f37eb2c682e8098bca7005006ed6fc99e360a58dbc1cbb6fb6ed2546507ab487d1420d3826da0d46b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tar-bg \
locale-tar-ca \
locale-tar-cs \
locale-tar-da \
locale-tar-de \
locale-tar-el \
locale-tar-eo \
locale-tar-es \
locale-tar-et \
locale-tar-eu \
locale-tar-fi \
locale-tar-fr \
locale-tar-ga \
locale-tar-gl \
locale-tar-hr \
locale-tar-hu \
locale-tar-id \
locale-tar-it \
locale-tar-ja \
locale-tar-ka \
locale-tar-ko \
locale-tar-ms \
locale-tar-nb \
locale-tar-nl \
locale-tar-pl \
locale-tar-pt \
locale-tar-pt-BR \
locale-tar-ro \
locale-tar-ru \
locale-tar-sk \
locale-tar-sl \
locale-tar-sr \
locale-tar-sv \
locale-tar-tr \
locale-tar-uk \
locale-tar-vi \
locale-tar-zh-CN \
locale-tar-zh-TW \
tar-lang \
tar-lang-all"

RDEPENDS:${PN} += "tar"

inherit rpm
