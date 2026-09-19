SUMMARY = "Buffer Explorer / Browser"
DESCRIPTION = "With bufexplorer, you can quickly and easily switch between buffers by using \
the one of the default public interfaces: \
\\<Leader\\>be normal open \
\\<Leader\\>bt toggle open / close \
\\<Leader\\>bs force horizontal split open \
\\<Leader\\>bv force vertical split open \
 \
Once the bufexplorer window is open you can use the normal movement keys (hjkl) \
to move around and then use or to select the buffer you would like to open. If \
you would like to have the selected buffer opened in a new tab, simply press \
either or 't'. Please note that when opening a buffer in a tab, that if the \
buffer is already in another tab, bufexplorer can switch to that tab \
automatically for you if you would like."
LICENSE = "BSD-3-Clause"

PV = "7.4.27"

RPM_NAME = "vim-plugin-bufexplorer-7.4.27-64.2.noarch.rpm"
RPM_HASH = "9ecb5ecb50705810e814e1f2c3bb5243a1188979cd1b6039c21333011f7aed20cc444a223276d73efaa773f396d8eb4bea7fe2874259032d15273807d55f228a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-bufexplorer"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
