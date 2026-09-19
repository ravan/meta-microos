SUMMARY = "Translations for package drawy"
DESCRIPTION = "Provides translations for the 'drawy' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "drawy-lang-1.0.2-1.2.noarch.rpm"
RPM_HASH = "d1f72bd321b4c70316c72431f206026d7afe97179e5a2e4ec2d51f1d1b05882f13404d807f52f5299c9abb001f95f9de41ca9802275086ce2a6416c127ca15c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drawy-lang \
drawy-lang-all \
locale-drawy-ar \
locale-drawy-ca \
locale-drawy-ca@valencia \
locale-drawy-cs \
locale-drawy-de \
locale-drawy-es \
locale-drawy-eu \
locale-drawy-fi \
locale-drawy-fr \
locale-drawy-ga \
locale-drawy-he \
locale-drawy-ia \
locale-drawy-is \
locale-drawy-it \
locale-drawy-ka \
locale-drawy-ko \
locale-drawy-nl \
locale-drawy-pt-BR \
locale-drawy-sk \
locale-drawy-sl \
locale-drawy-tr \
locale-drawy-uk \
locale-drawy-zh-CN \
locale-drawy-zh-TW"

RDEPENDS:${PN} += "drawy"

inherit rpm
