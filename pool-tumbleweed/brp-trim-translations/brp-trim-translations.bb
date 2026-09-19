SUMMARY = "Trim translations from desktop files, polkit actions, mimetype descriptions and AppStream metainfo"
DESCRIPTION = "Extract and trim translations from all desktop files, polkit \
actions, mimetype descriptions and AppStream metainfo found in \
build root"
LICENSE = "GPL-2.0-or-later"

PV = "84.87"

RPM_NAME = "brp-trim-translations-84.87-10.1.noarch.rpm"
RPM_HASH = "2b404625d3f2b37a286ac408f664ffea8508edb059815b9697539accfcf7f5470ce42db3044334142c902060ae885f01ce4fca1363cc6f7ba48ab1becaea0b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brp-trim-desktop \
brp-trim-translations"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
libxslt-tools"

inherit rpm
