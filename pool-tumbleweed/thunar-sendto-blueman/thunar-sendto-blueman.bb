SUMMARY = "A sendto integration for Thunar"
DESCRIPTION = "This package add sendto integration for Thunar."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "thunar-sendto-blueman-2.4.6-1.5.noarch.rpm"
RPM_HASH = "ba031f9e851c8885c944554e7f379759567936e9d4386c8bf108da2ed7d8dcab53abffa5e61c299a493b5ab5c117ae68366b65182d53a15383f59ba7e698fdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "thunar-sendto-blueman"

RDEPENDS:${PN} += "blueman"

inherit rpm
