SUMMARY = "Plug-in for GNU poke for editing DWARF files"
DESCRIPTION = "poke-dwarf is a GNU poke pickle for editing DWARF debugginf information. It \
covers Call Frame Information, DIE tree, debug types, expressions, and much \
more."
LICENSE = "GPL-3.0-or-later"

PV = "0.1~git20231115"

RPM_NAME = "poke-dwarf-0.1~git20231115-1.8.noarch.rpm"
RPM_HASH = "f98a366cf33e7e0003e31b9aadde88c7f76544500905ad394dd713a1321b00d5310b767a067e650ea34062b4f62e2428422093959aa0f4f7bafe9cc59216f722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poke-dwarf"

RDEPENDS:${PN} += "poke"

inherit rpm
