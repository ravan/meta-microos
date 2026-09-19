SUMMARY = "Setup GNOME environment module for tik"
DESCRIPTION = "Setup GNOME environment module for tik. Configures the GNOME tik installer environment."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-module-setup-gnome-env-1.5.1-3.1.noarch.rpm"
RPM_HASH = "cdc9a36eb67331a05292f370318448719daab106256194b4091e005be1b3b20ae1cc435cd6ef23818e8b0cc1ef0348f77ebdbf8fb70ca5936b4a3dcf9acce588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tik-module-setup-gnome-env"

RDEPENDS:${PN} += "tik"

inherit rpm
