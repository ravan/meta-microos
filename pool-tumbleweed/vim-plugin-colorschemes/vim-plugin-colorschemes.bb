SUMMARY = "Vim color schemes selection"
DESCRIPTION = "Selection of vim color schemes based on Colors Sample Pack - \
http://www.vim.org/scripts/script.php?script_id=625."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "vim-plugin-colorschemes-1.0-64.2.noarch.rpm"
RPM_HASH = "d45d4c832b59bf321b65159930eb4aaf1adb3788c6be161f0e15f5212d143bc169e34197c5d7626454e630125667f824e32624eb76705daf074cbec449190885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-colorschemes"

RDEPENDS:${PN} += "vim"

inherit rpm
