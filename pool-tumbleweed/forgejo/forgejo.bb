SUMMARY = "Self-hostable forge"
DESCRIPTION = "Providing Git hosting for your project, friends, company or community? Forgejo \
(/for'd͡ʒe.jo/ inspired by forĝejo – the Esperanto word for forge) has you \
covered with its intuitive interface, light and easy hosting and a lot of \
builtin functionality."
LICENSE = "GPL-3.0-or-later"

PV = "16.0.3"

RPM_NAME = "forgejo-16.0.3-1.1.aarch64.rpm"
RPM_HASH = "54c2b3ec3fc7b3a3b90a8aa7025cde392fee31d702d8cf04b3aad016ff151eeb5b4206bb35a510841ddbacbf51577860efc51c3b3e3a67e4b9831c8a66a4f412"

RPROVIDES:${PN} += "config-forgejo \
forgejo \
group-forgejo \
user-forgejo"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
git-lfs \
libc.so.6 \
systemd \
sysuser-shadow"

inherit rpm
