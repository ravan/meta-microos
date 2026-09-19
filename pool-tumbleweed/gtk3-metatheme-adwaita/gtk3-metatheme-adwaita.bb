SUMMARY = "GTK+ 3 support for the Adwaita GNOME theme"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gtk3-metatheme-adwaita-3.28-3.5.noarch.rpm"
RPM_HASH = "ef0fb9d6d266c48fd45a136be4fc9c842df7bbc46a4d65550d1979804a166b349cf0817ae57917ea9def05f1b2afd6d0851dfc1baa5b480ca4ec487b4dd07934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-adwaita"

RDEPENDS:${PN} += "cantarell-fonts \
metatheme-adwaita-common"

inherit rpm
