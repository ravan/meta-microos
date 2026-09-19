SUMMARY = "Update and verify unofficial Clam Anti-Virus signatures"
DESCRIPTION = "Fangfrisch (German for 'freshly caught') is a sibling of the Clam \
Anti-Virus freshclam utility. It allows downloading virus definition \
files that are not official ClamAV canon, e.g. from Sanesecurity and \
URLhaus. Fangfrisch was designed with security in mind, to be run by an \
unprivileged user only."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.2"

RPM_NAME = "python314-fangfrisch-1.9.2-1.5.noarch.rpm"
RPM_HASH = "a5a65fbcd268b57bda77051afd24ee4cc75657ef731becf8e7fb4b55287778d9b7da52a5fef327ebd30d016f46da5a041868e8fcf50196226e308f9aaf69c641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fangfrisch \
python314-fangfrisch \
python3dist-fangfrisch"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-SQLAlchemy \
python314-requests \
update-alternatives"

inherit rpm
