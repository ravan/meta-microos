SUMMARY = "A recreation of the 'decrypting text' effect from the 1992 movie Sneakers"
DESCRIPTION = "A tool to recreate the famous 'decrypting text' effect as seen in the 1992 movie Sneakers."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "no-more-secrets-1.0.1-1.18.aarch64.rpm"
RPM_HASH = "235b9a0dcc08f4e345ae285a0a15c32d96f9faa355873dafbb540bd2d7234c60c9784c7aca853b23640326d9b06ed3cbc1add03f10ee5efec4082853bba92ca8"

RPROVIDES:${PN} += "no-more-secrets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
