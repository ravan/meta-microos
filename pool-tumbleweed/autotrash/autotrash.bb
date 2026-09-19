SUMMARY = "Tool to automatically purge old trashed files"
DESCRIPTION = "Autotrash is a small python script to automatically remove (permanently delete) \
trashed files. It relies on the FreeDesktop.org Trash files for it's deletion \
information."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7"

RPM_NAME = "autotrash-0.4.7-1.5.noarch.rpm"
RPM_HASH = "cd3eaad0e7089bc731335e2e4ac5121dd590bfe2ccada5b3aa5631bd5dc11210bd5a4668263379820fdf12b9525b86cae044964d29cc581d78b90352443386c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autotrash \
python3.13dist-autotrash \
python3dist-autotrash"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
python-abi"

inherit rpm
