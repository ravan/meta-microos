SUMMARY = "WSL GUI packages"
DESCRIPTION = "This package contains the wsl_gui pattern: recommended configs,tools,libraries for using WSLg."
LICENSE = "MIT"

PV = "20240327"

RPM_NAME = "patterns-wsl-gui-20240327-1.7.noarch.rpm"
RPM_HASH = "63252f494f93f3b853b73959291681cbb58866bb34f5f766f97b9c3a5c78db6c2caf3ef3b966a721574d14faf47de2751971109840a97460a701e567321faf88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-visible- \
patterns-wsl-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
lato-fonts"

inherit rpm
