SUMMARY = "Kalpa Desktop default settings"
DESCRIPTION = "This package provides default configurations and applications for Kalpa Desktop"
LICENSE = "MIT"

PV = "20260819"

RPM_NAME = "plasma-branding-Kalpa-20260819-1.1.noarch.rpm"
RPM_HASH = "529f8e59eda67ae3aae3a2ad123022ba8d32c8ebd854431881a32311c7c35a32c757a060e4e6a75a8ae442f23046c5caabe41d677626a610ee3697e4eca681bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "branding-Kalpa \
plasma-branding \
plasma-branding-Kalpa \
plasma-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
kdialog \
polkit \
sound-theme-freedesktop \
sudo \
transactional-update"

inherit rpm
