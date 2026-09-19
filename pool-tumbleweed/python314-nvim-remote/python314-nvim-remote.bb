SUMMARY = "Neovim process control utility"
DESCRIPTION = "This package provides an executable called 'nvr' which solves these cases: \
 \
- Controlling nvim processes from the shell, e.g. opening files in another \
  terminal window. \
- Opening files from within `:terminal` without starting a nested nvim process."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python314-nvim-remote-5.0.0-2.3.noarch.rpm"
RPM_HASH = "9a2d29707d71544194ca9d05fa43f2cfbd688d813f073abe8b0b97ff855b218ade725c4d289272ca08fa464da7b15f75a3daa0f70b68cef2f34066109247a780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nvim-remote \
python314-nvim-remote \
python3dist-nvim-remote"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-neovim \
python314-psutil \
update-alternatives"

inherit rpm
