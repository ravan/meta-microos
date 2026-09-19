SUMMARY = "Arc Icon Theme"
DESCRIPTION = "A flat icon theme that mainly includes icons for directories and \
mimetypes. \
Requires Moka or Adwaita as fallback icons."
LICENSE = "GPL-3.0+"

PV = "20161122"

RPM_NAME = "arc-icon-theme-20161122-1.24.noarch.rpm"
RPM_HASH = "83306e9b4aff5064328a333137d84e1a495fa490c0473d1c118526e933b55e7e51288a7bb9ccef10afa5f9a53091f7c34697cf2983ff72ebc06c4cd7f9e31f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arc-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
adwaita-icon-theme"

inherit rpm
