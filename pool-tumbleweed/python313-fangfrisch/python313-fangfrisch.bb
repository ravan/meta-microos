SUMMARY = "Update and verify unofficial Clam Anti-Virus signatures"
DESCRIPTION = "Fangfrisch (German for 'freshly caught') is a sibling of the Clam \
Anti-Virus freshclam utility. It allows downloading virus definition \
files that are not official ClamAV canon, e.g. from Sanesecurity and \
URLhaus. Fangfrisch was designed with security in mind, to be run by an \
unprivileged user only."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.2"

RPM_NAME = "python313-fangfrisch-1.9.2-1.5.noarch.rpm"
RPM_HASH = "48c5eef94940ed6c97c63bac15901889ae1f48305a7d534524f02a7f5923f75429d217f06ecf741325b8d41e28013fba1758495db5e5759c1fc37f0da13b2e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fangfrisch \
python3.13dist-fangfrisch \
python313-fangfrisch \
python3dist-fangfrisch"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-SQLAlchemy \
python313-requests \
update-alternatives"

inherit rpm
