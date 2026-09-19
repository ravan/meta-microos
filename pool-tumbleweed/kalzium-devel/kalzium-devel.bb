SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalzium-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2faa74813791f661bd1586850bc36037c64585f31414d90f1a49c4398cabfa8fb4693d64f767c53e4c0160f936179a5cee974873b20b41ec5afd1a4f9982d1a7"

RPROVIDES:${PN} += "kalzium-devel"

RDEPENDS:${PN} += "kalzium"

inherit rpm
