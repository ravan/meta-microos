SUMMARY = "C library with utility functions"
DESCRIPTION = "Klib is a C library that provides data types like hashes, search \
trees, AVL trees, sorting functions, a dynamic array type, a \
singly-linked list and memory pool, various numeric routines and a \
command-line argument parser."
LICENSE = "MIT"

PV = "1.0~git.20251221"

RPM_NAME = "klib-1.0~git.20251221-1.2.noarch.rpm"
RPM_HASH = "af1c15daa666a42440dc4b066a5114f5a8ebe03e7046301680ce5d163e32a1e44d75e73fae650c0dcc0706b4758d97a20f4ac9ae079c4dde1b5763dbfac2cddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klib"

RDEPENDS:${PN} += ""

inherit rpm
