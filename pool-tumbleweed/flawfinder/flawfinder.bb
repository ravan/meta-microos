SUMMARY = "C/C++ source code security flaw examination tool"
DESCRIPTION = "Flawfinder scans through C/C++ source code, identifying lines \
('hits') with potential security flaws. By default it reports hits \
sorted by severity, with the riskiest lines first."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.20"

RPM_NAME = "flawfinder-2.0.20-1.2.noarch.rpm"
RPM_HASH = "30f2e964dc7423fe8d0e267bb8437e9a2ab6bea782060ca4a31f637ec542afd0be95fcaa18fc3458706114572cbd95fb988b7922e85df4009ad5295688649ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flawfinder \
python3.13dist-flawfinder \
python3dist-flawfinder"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3"

inherit rpm
