SUMMARY = "Emoji input method for IBus framework"
DESCRIPTION = "ibus-table-emoticon provides table for emoticons o(*￣▽￣*)q."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-emoticon-1.3.21-1.5.noarch.rpm"
RPM_HASH = "68dad17ec3c9752dfc4215ed1a9ffceaea32a868d5c51cf60171ddcffdbe1305e76706b3a65a9558b9ea56d77a99d25f8298631b2e2a9e373591d9517d24eac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-emoji \
ibus-table-emoticon"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
