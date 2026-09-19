SUMMARY = "GNOME Desktop Environment (Wayland)"
DESCRIPTION = "The GNOME desktop environment is an intuitive and attractive desktop for users. \
This pattern installs components for GNOME to run with Wayland and X11 technologies."
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome-20250310-10.2.aarch64.rpm"
RPM_HASH = "fd988d279bcf1e8722f4cd7cc7af577ce36019e0e1a1f3ef3bb9a750eeb92c7dcf335ae2d50cb798b111e37536b3e5ec35c35f5b5e8eabb1a8a0e7478d87e45e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-gnome-gnome"

RDEPENDS:${PN} += "gnome-session-wayland \
pattern-"

inherit rpm
