SUMMARY = "libzypp extension to handle AppStream metadata"
DESCRIPTION = "This plugin extends libzypp to install AppStream metadata, as extracted from the \
repository metadata, onto the file system in order to be picked up by \
software centers."
LICENSE = "CC0-1.0 & MIT"

PV = "1.0.1+git.20240209"

RPM_NAME = "libzypp-plugin-appdata-1.0.1+git.20240209-1.8.noarch.rpm"
RPM_HASH = "1aefc05b7637fa407cf8030431bdde3c04923ac84c8cdcdb851d5b24e48f150bfa13cf7a50c30ff24569c7b1e77a3bda65f4ba1f00a1705cad991ddf4fa8400d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appstream-provider \
libzypp-plugin-appdata"

RDEPENDS:${PN} += "-appstream-glib >= 0.3.6 with asglib(swcatalog) \
/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
libzypp \
python3-cmdln \
python3-createrepo-c \
zypper"

inherit rpm
