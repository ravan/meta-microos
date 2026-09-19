SUMMARY = "Plugin for transparent editing of gpg encrypted files"
DESCRIPTION = "This script implements transparent editing of gpg encrypted files. The filename \
must have a '.gpg', '.pgp' or '.asc' suffix. When opening such a file the \
content is decrypted, when opening a new file the script will ask for the \
recipients of the encrypted file. The file content will be encrypted to all \
recipients before it is written. The script turns off viminfo, swapfile, and \
undofile to increase security."
LICENSE = "GPL-1.0-or-later"

PV = "2.7.1"

RPM_NAME = "vim-plugin-gnupg-2.7.1-64.2.noarch.rpm"
RPM_HASH = "8bba0b26fd8431759e25ac829a63b1e209150470c20db7bf79aab478e4cb2d201dd6b33f78368d962a257c0b328a4e1f03b538a7937e849edaf23f91a189d748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gnupg"

RDEPENDS:${PN} += "/usr/bin/sh \
gpg2"

inherit rpm
