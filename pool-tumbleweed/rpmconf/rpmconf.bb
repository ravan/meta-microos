SUMMARY = "Tool to handle rpmnew and rpmsave files"
DESCRIPTION = "This tool search for .rpmnew, .rpmsave and .rpmorig files and ask \
you what to do with them: \
Keep current version, place back old version, watch the diff or merge."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.12"

RPM_NAME = "rpmconf-1.1.12-1.2.noarch.rpm"
RPM_HASH = "a353205168418d67cde3a72248ffbb8016f87548844cccfae098338e2bd29501943519a4807f5343c9d74645cd61fdd92ba995ac13fa0d62315d610a050d891d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmconf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-rpm \
python3-rpmconf"

inherit rpm
