SUMMARY = "Azure Entra Id DAG URL QR code GNOME Shell extension"
DESCRIPTION = "GNOME Shell extension that adds a QR code to authentication prompts \
when a MS DAG URL is detected."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.14+git0.7d1ea961"

RPM_NAME = "himmelblau-qr-greeter-3.1.14+git0.7d1ea961-1.1.noarch.rpm"
RPM_HASH = "03fad34b59c44867d18a36df51a7d00d256ff78ab152b5eb757eaf0e00ae787de1839fa414f25a923687bf6db526c5050af08734dae255865e0ec79de9e32b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "himmelblau-qr-greeter"

RDEPENDS:${PN} += "gnome-shell \
himmelblau"

inherit rpm
