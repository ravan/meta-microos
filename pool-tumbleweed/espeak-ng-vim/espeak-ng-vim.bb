SUMMARY = "Vim syntax highlighting for espeak-ng data files"
DESCRIPTION = "Optional files for syntax highlighting for espeak-ng data files in vim."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.52.0"

RPM_NAME = "espeak-ng-vim-1.52.0-2.6.noarch.rpm"
RPM_HASH = "91ac4d8779ab67c0b2df07720d7dbd9bd6560e771d9ea86f30fe4dc5e9903f08be3f2c66f954b53b0e579a66add46ae4c32a7e5827b961ef469851630be578f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "espeak-ng-vim"

RDEPENDS:${PN} += "espeak-ng"

inherit rpm
