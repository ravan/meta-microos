SUMMARY = "Alternate files quickly"
DESCRIPTION = "Vim plugin to quickly switch between corresponding files. E.g. if you are \
editing foo.c and need to edit foo.h simply execute :A and you will be editing \
foo.h, to switch back to foo.c execute :A again. It has builtin support for C, \
C++ and ADA95 and can be configured to support a variety of languages."
LICENSE = "ISC"

PV = "2.18"

RPM_NAME = "vim-plugin-a-2.18-64.2.noarch.rpm"
RPM_HASH = "ded87328e4a09c7117040f491f2f4eb4e69b3cecfe218877f0dd93f40763a725b04464176f444daf44d05c47012d9652db95a25c869c6228229e663b40fa4ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-a"

RDEPENDS:${PN} += "vim"

inherit rpm
