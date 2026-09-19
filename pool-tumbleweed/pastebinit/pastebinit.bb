SUMMARY = "Script to Send Data to Pastebin Sites"
DESCRIPTION = "This software lets you send a file or simply the result of a command directly \
to the pastebin you want (if it's supported) and gives you the URL in return."
LICENSE = "GPL-2.0-only"

PV = "1.7.1"

RPM_NAME = "pastebinit-1.7.1-1.4.noarch.rpm"
RPM_HASH = "17933c6633d0271730c8237551335ee32874e03a47a1109960b2b84e6c5dfcdd4f70fda833f9892f6e503ff4e7a8c29f5fac66a2ea9a1e82180b135e58cbf14f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pastebinit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-distro"

inherit rpm
