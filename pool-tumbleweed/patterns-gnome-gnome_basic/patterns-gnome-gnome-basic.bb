SUMMARY = "GNOME Desktop Environment (Basic)"
DESCRIPTION = "The GNOME desktop environment is an intuitive and attractive desktop for users. \
This pattern installs GNOME desktop environment with only essential graphical \
applications installed (File Manager, Web Browser)."
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_basic-20250310-10.2.aarch64.rpm"
RPM_HASH = "9c70aadd4cfb05e4666a8dfccd262bc881f897f9a3b69f963542423bc96e5d1916f4a71d8035f1ebd1e141b9ea5fddb662abd6691ad6fe7694a481421b767103"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-gnome-gnome-basic \
patterns-openSUSE-gnome"

RDEPENDS:${PN} += "gnome-user-share \
gsettings-backend-dconf \
pattern- \
seahorse"

inherit rpm
