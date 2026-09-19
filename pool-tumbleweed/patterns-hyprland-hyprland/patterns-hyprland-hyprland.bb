SUMMARY = "Hyprland (Wayland compositor)"
DESCRIPTION = "Hyprland is a dynamic tiling Wayland compositor. \
 \
This pattern installs a minimal Hyprland session with common essentials: \
a bar, notifications, launcher, screenshot tools, wallpaper daemon, and a file \
manager."
LICENSE = "MIT"

PV = "20260129"

RPM_NAME = "patterns-hyprland-hyprland-20260129-2.2.noarch.rpm"
RPM_HASH = "114348e5739f958a86a091fd4a1b0c58febd428235763e46bf6cd0387b2fe8123b09951580c7f7f8160531e11b4055d755acfe6039894e9fdd393deae9ff6340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-hyprland-hyprland"

RDEPENDS:${PN} += "hyprland \
pattern- \
xdg-desktop-portal \
xdg-desktop-portal-hyprland"

inherit rpm
