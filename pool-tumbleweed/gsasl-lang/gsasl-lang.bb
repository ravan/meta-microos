SUMMARY = "Translations for package gsasl"
DESCRIPTION = "Provides translations for the 'gsasl' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "gsasl-lang-2.2.4-1.2.noarch.rpm"
RPM_HASH = "96be303ee51655f7c91c484578d39b9808eb1a2251489668aa90d2098f1c5f7a12030d0a92e1a60548606a28077bbde607c5ea3d962275383cc32cf5af51e0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsasl-lang \
gsasl-lang-all \
locale-gsasl-da \
locale-gsasl-de \
locale-gsasl-eo \
locale-gsasl-es \
locale-gsasl-eu \
locale-gsasl-fi \
locale-gsasl-fr \
locale-gsasl-ga \
locale-gsasl-hr \
locale-gsasl-hu \
locale-gsasl-id \
locale-gsasl-it \
locale-gsasl-ka \
locale-gsasl-nl \
locale-gsasl-pl \
locale-gsasl-pt-BR \
locale-gsasl-ro \
locale-gsasl-sk \
locale-gsasl-sq \
locale-gsasl-sr \
locale-gsasl-sv \
locale-gsasl-uk \
locale-gsasl-vi \
locale-gsasl-zh-CN \
locale-gsasl-zh-TW"

RDEPENDS:${PN} += "gsasl"

inherit rpm
