SUMMARY = "Tool for launching and easy-updates of Tor Browser"
DESCRIPTION = "Tor Browser Launcher is intended to make Tor Browser easier to \
install and use for GNU/Linux users. You install \
torbrowser-launcher from your distribution's package manager and \
it handles everything else: \
  - Downloads and installs the most recent version of Tor Browser \
    in your language and for your computer's architecture, or \
    launches Tor Browser if it's already installed (Tor Browser \
    will automatically update itself) \
  - Certificate pins to https://www.torproject.org, so it doesn't \
    rely on certificate authorities \
  - Verifies Tor Browser's signature for you, to ensure the \
    version you downloaded was cryptographically signed by Tor \
    developers and was not tampered with \
  - Adds 'Tor Browser' and 'Tor Browser Launcher Settings' \
    application launcher to your desktop environment's menu \
  - Apparmor profile to limit effect of Tor network compromise \
  - Optionally plays a modem sound when you open Tor Browser \
    (because Tor is so slow)."
LICENSE = "MIT"

PV = "0.3.9"

RPM_NAME = "torbrowser-launcher-0.3.9-1.3.noarch.rpm"
RPM_HASH = "92243d544e70931fe523f91b1fdd66c1ef7bb5994319eb665885dc0b7de3c885be70320a3d8ae658facc1068d40f4eb1d893e4cece22f8974bcc7459d585a9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-torbrowser-launcher \
python3dist-torbrowser-launcher \
torbrowser-launcher"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gpg2 \
hicolor-icon-theme \
python-abi \
python3-PySocks \
python3-gpg \
python3-packaging \
python3-pyside6 \
python3-requests"

inherit rpm
