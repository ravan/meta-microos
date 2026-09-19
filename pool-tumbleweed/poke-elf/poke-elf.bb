SUMMARY = "Plug-in for GNU poke for editing ELF files"
DESCRIPTION = "poke-elf is a GNU poke pickle for editing ELF object files, executables, shared \
libraries and core dumps. It supports many architectures and extensions."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "poke-elf-1.0-1.7.noarch.rpm"
RPM_HASH = "1a37000ae73e70fda497670071e469beecd9f91ceafed33fa0c814746ebc8120dfe032bd90272786d990e0ede59fe9c4458e1dff3b6707db92a55af860250dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poke-elf"

RDEPENDS:${PN} += "/usr/bin/env \
poke"

inherit rpm
