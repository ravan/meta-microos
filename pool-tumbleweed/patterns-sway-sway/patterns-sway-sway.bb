SUMMARY = "Sway Tiling Wayland Compositor and related tools"
DESCRIPTION = "Sway Tiling Wayland Compositor and related tools."
LICENSE = "MIT"

PV = "20200619"

RPM_NAME = "patterns-sway-sway-20200619-6.9.aarch64.rpm"
RPM_HASH = "a3bb9a495908873df9e4065b085f173334b7a4f8a5b29c8d503fd98a850541de8d97c68fc35a9c6a8986914d84db08f8e4498a11061389f548a9b9f883ec3c0a"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-sway-sway"

RDEPENDS:${PN} += "Mesa \
alacritty \
fontawesome-fonts \
grim \
slurp \
sway \
swaybg \
swayidle \
swaylock \
waybar \
wofi"

inherit rpm
