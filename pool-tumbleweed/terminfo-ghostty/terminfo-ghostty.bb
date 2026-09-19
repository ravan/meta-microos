SUMMARY = "Terminfo files for ghostty"
DESCRIPTION = "Ghostty is a fast, feature-rich, and cross-platform terminal \
emulator that uses platform-native UI and GPU acceleration. \
 \
This holds the terminfo files for ghostty."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "terminfo-ghostty-1.3.1-1.6.noarch.rpm"
RPM_HASH = "5632c1590bc8b8161981ad04b2ce9963ec378067fe6b7387e2ed38834359adb70ac3b6794076d3df7be182317cacc46e7993ea8ec58d884264c4f3a9b431735c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminfo-ghostty"

RDEPENDS:${PN} += ""

inherit rpm
