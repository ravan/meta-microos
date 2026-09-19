SUMMARY = "A tree explorer plugin for navigating the filesystem"
DESCRIPTION = "The NERD tree allows you to explore your filesystem and to open files and \
directories. It presents the filesystem to you in the form of a tree which you \
manipulate with the keyboard and/or mouse. It also allows you to perform simple \
filesystem operations."
LICENSE = "WTFPL"

PV = "7.1.3"

RPM_NAME = "vim-plugin-NERDtree-7.1.3-64.2.noarch.rpm"
RPM_HASH = "ae01471b95a19bd318a93671b344171aefefd2fb805d66291849ce82a260352609f59f0767c0c1f6da0ae0db98023c69705ec10daecbc17c5c1cbd6ab9a98016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-NERDtree"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
