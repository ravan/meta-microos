SUMMARY = "Calendar for vim"
DESCRIPTION = "Plugin for vim that displays simple calendar in the side window."
LICENSE = "BSD-3-Clause"

PV = "2.5"

RPM_NAME = "vim-plugin-calendar-2.5-64.2.noarch.rpm"
RPM_HASH = "06d12c1273478809e036c0d4daa16d7c4650331e3ec0bbb08ce60612bf68247bc5adfc4b99fbe1af1715c1c8c07330170bb50ab55b57ad7f1553c3577a4455f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-calendar"

RDEPENDS:${PN} += "vim"

inherit rpm
