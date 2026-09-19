SUMMARY = "ZSH completion for sheldon"
DESCRIPTION = "ZSH command line completion support for sheldon."
LICENSE = "MIT | Apache-2.0 & MIT & Zlib & LGPL-2.1-or-later & CC-BY-SA-4.0 & Apache-2.0-with-LLVM-exception & BSD-4-clause & OpenSSL & Unicode & SUSE-GPL-2.0-with-linking-exception"

PV = "0.8.5"

RPM_NAME = "sheldon-zsh-completion-0.8.5-1.8.noarch.rpm"
RPM_HASH = "a3449bd3e7c137f908cd53ed185618fc4a93ecdc294d9d8bc5ee450eed77a1dd84da4f67e5bb1e04dc270b594fa1779181afb43342b97f9e30de5dfec1c51701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sheldon-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
