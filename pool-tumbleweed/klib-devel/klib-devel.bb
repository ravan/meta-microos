SUMMARY = "Development files for klib"
DESCRIPTION = "Klib is a C library that provides data types like hashes, search \
trees, AVL trees, sorting functions, a dynamic array type, a \
singly-linked list and memory pool, various numeric routines and a \
command-line argument parser. \
 \
To use a component of this library, files need to be copied to the \
source code tree where it is supposed to be used."
LICENSE = "MIT"

PV = "1.0~git.20251221"

RPM_NAME = "klib-devel-1.0~git.20251221-1.2.noarch.rpm"
RPM_HASH = "ef814c0ce68dfabbc55d12c290bd579de8a0145552f205d3149fc2095d4ebd566a14a2a47412c92571e4d963491eb3ae67391adfaa79f1a7ad542ea33036b7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klib-devel"

RDEPENDS:${PN} += "klib"

inherit rpm
