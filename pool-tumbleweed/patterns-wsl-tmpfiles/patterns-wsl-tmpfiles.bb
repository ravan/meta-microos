SUMMARY = "Setup WSLg tmpfiles.d configuration"
DESCRIPTION = "The package installs /usr/lib/tmpfiles.d/wslg.conf so the proper symlink to /mnt/wslg/.X11-unix exists at boot."
LICENSE = "MIT"

PV = "20240327"

RPM_NAME = "patterns-wsl-tmpfiles-20240327-1.7.noarch.rpm"
RPM_HASH = "fc28544842385b24fd63b0655650bb954cfbf0397d599970ffef65c8f0ae594424712924c3cb02478fb31e8e14ebffe916b440098e4601c956d370a1dc44e425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patterns-wsl-tmpfiles"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
