SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python314-pyzo-4.11.2-2.5.noarch.rpm"
RPM_HASH = "47867b989c763bc69a6ef556937be1817decf3c47eb4ea00576a29d956bcca549ea5391a3d936f8fc363b58e1404135c3a6b9ef848b040d48a480f3e28e53e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyzo \
python314-pyzo \
python3dist-pyzo"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
python314-qt5 \
pyzologo"

inherit rpm
