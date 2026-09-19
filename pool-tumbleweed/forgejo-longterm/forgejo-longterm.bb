SUMMARY = "Self-hostable forge"
DESCRIPTION = "Providing Git hosting for your project, friends, company or community? Forgejo \
(/for'd͡ʒe.jo/ inspired by forĝejo – the Esperanto word for forge) has you \
covered with its intuitive interface, light and easy hosting and a lot of \
builtin functionality."
LICENSE = "GPL-3.0-or-later"

PV = "15.0.6"

RPM_NAME = "forgejo-longterm-15.0.6-1.1.aarch64.rpm"
RPM_HASH = "e53390d573a25489051bddf4322c51fcf142b695ab39ab66e04f6d5d829758432d9e508aec39cce80e4c139583a3fd037f7c63f23ba2317b17d8c35d4e0a5179"

RPROVIDES:${PN} += "config-forgejo-longterm \
forgejo-longterm \
group-forgejo \
user-forgejo"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
git-lfs \
libc.so.6 \
systemd \
sysuser-shadow"

inherit rpm
