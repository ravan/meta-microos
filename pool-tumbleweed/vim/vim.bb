SUMMARY = "Vi IMproved"
DESCRIPTION = "Vim (Vi IMproved) is an almost compatible version of the UNIX editor \
vi. Almost every possible command can be performed using only ASCII \
characters. Only the 'Q' command is missing (you do not need it). Many \
new features have been added: multilevel undo, command line history, \
file name completion, block operations, and editing of binary data."
LICENSE = "Vim"

PV = "9.2.0901"

RPM_NAME = "vim-9.2.0901-1.1.aarch64.rpm"
RPM_HASH = "d26cfc2539a37084b4d543457579bc8f8ac6fab6ca7a036142bc3bc5d963df6c401104b07bd64712f7645e722342eb345a3c93947f83f0ee385947c9f267756a"

RPROVIDES:${PN} += "vi \
vim \
vim-base \
vim-client \
vim-enhanced \
vim-python"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libm.so.6 \
libperl.so \
libselinux.so.1 \
libtinfo.so.6 \
perl \
vim-data-common \
xxd"

inherit rpm
