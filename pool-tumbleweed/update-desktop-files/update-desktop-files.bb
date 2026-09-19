SUMMARY = "A Build Tool to Update Desktop Files"
DESCRIPTION = "This package provides further translations and a shell script to update \
desktop files. It is used by the %suse_update_desktop_file rpm macro."
LICENSE = "GPL-2.0-or-later"

PV = "84.87"

RPM_NAME = "update-desktop-files-84.87-10.1.noarch.rpm"
RPM_HASH = "7e22b4cdd1dfcea6b1a0b2c43fcc5e4af1813bb96e71a9fbb1da8e86f13ae5a3551763aac92c4ec3a7cc07839c47d92ec59746afbeca0be6f0c94af32c5e4e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-suse-update-desktop-file \
update-desktop-files"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
desktop-file-utils \
desktop-translations-devel \
gettext-tools \
intltool"

inherit rpm
