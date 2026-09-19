SUMMARY = "Bash completion for sheldon"
DESCRIPTION = "Bash command line completion support for sheldon."
LICENSE = "MIT | Apache-2.0 & MIT & Zlib & LGPL-2.1-or-later & CC-BY-SA-4.0 & Apache-2.0-with-LLVM-exception & BSD-4-clause & OpenSSL & Unicode & SUSE-GPL-2.0-with-linking-exception"

PV = "0.8.5"

RPM_NAME = "sheldon-bash-completion-0.8.5-1.8.noarch.rpm"
RPM_HASH = "f83e3ef07eeb4fb96658d37670282cc496aa91c320e995f592cf8aa464a3783915dc73b3d8d5193efb731c57843d193d7e30f2c8b5b04f08d202f6e76c2da3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sheldon-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
