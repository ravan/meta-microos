SUMMARY = "Hyprland Extra Components (plugins and add-ons)"
DESCRIPTION = "Optional add-ons for the Hyprland Wayland compositor, including commonly used \
plugins and additional workflow tools."
LICENSE = "MIT"

PV = "20260129"

RPM_NAME = "patterns-hyprland-hyprland_extra-20260129-2.2.noarch.rpm"
RPM_HASH = "318c45893744c57954c7d05d8514c73a9d5b0b03786572bc301a9df88c04f6c7fea193f15f0b08aa84c92492449276755087ed8e78108d320ca971c0c24e829d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-hyprland-hyprland-extra"

RDEPENDS:${PN} += "pattern-"

inherit rpm
