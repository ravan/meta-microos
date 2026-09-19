SUMMARY = "Extract translations from desktop files, polkit actions, mimetype descriptions and AppStream metainfo"
DESCRIPTION = "Extract translations from all desktop files, polkit actions, mimetype descriptions \
and AppStream metainfo found in build root"
LICENSE = "GPL-2.0-or-later"

PV = "84.87"

RPM_NAME = "brp-extract-translations-84.87-10.1.noarch.rpm"
RPM_HASH = "90cb16a63c3566684473406fe2962f63bdad5ee6cb22f36c91499409d4c0cdcb75e9ea6fd15867e0c8c05e2c943ef347818c1a02c0853283cffc62edee96069f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brp-extract-translations \
brp-trim-desktop"

RDEPENDS:${PN} += "/usr/bin/bash \
libxslt-tools"

inherit rpm
