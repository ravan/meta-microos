SUMMARY = "Miriway SDDM greeter configuration"
DESCRIPTION = "This package contains configuration and dependencies for the initial-setup \
GUI to use Miriway for the Wayland Compositor."
LICENSE = "GPL-3.0-only"

PV = "26.06.1"

RPM_NAME = "sddm-wayland-miriway-26.06.1-1.2.noarch.rpm"
RPM_HASH = "c40612d70df27b4742145e64c54ee154dcfbf976f579755068ae1f3a11c9f55ac7d059ca6d53c793f0417d7033ef12d8ad956d7aae648989dd47b3490a87b4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-wayland-miriway"

RDEPENDS:${PN} += "layer-shell-qt6 \
miriway \
sddm"

inherit rpm
