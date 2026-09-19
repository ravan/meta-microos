SUMMARY = "LeechCraft configurable font substitutions Module"
DESCRIPTION = "This package allows configurable font substitutions for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-fontiac-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "62014038d6216fa715f2fdaf99b4010d5e56027f10938b7ce0ba9483c755a9789ac136aac8ffa197dda6711169379071eae19e916a39922eb9c954f8f826f3d9"

RPROVIDES:${PN} += "leechcraft-fontiac \
libleechcraft-fontiac.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
