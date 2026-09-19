SUMMARY = "MicroOS Desktop default settings"
DESCRIPTION = "This package installs MicroOS default applications for Plasma."
LICENSE = "BSD-3-Clause"

PV = "20240611"

RPM_NAME = "plasma-branding-MicroOS-20240611-1.7.noarch.rpm"
RPM_HASH = "24d45c12a17439645770e752fe3737d5212152da5d9c84067f6b8fb4d849fffab0f20f49bb550b9d26381677ba1c563e9d5610db7eb45ae4b398b231e1060012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plasma-branding-MicroOS \
plasma-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
kdialog \
libqt5-qdbus \
sound-theme-freedesktop \
transactional-update"

inherit rpm
