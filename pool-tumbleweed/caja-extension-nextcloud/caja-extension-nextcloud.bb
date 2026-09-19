SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Caja file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "caja-extension-nextcloud-34.0.3-1.1.noarch.rpm"
RPM_HASH = "a933123cdbd2bbfc442bfd9b58f54042ca163937d3b4a4455cafb5e054916e9ccf18e8e111667971b634d8e6381ae708daed540604e4034e60a44b0d918c23d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-nextcloud"

RDEPENDS:${PN} += "caja \
nextcloud-desktop \
python-caja \
typelib-Caja \
typelib-GObject"

inherit rpm
