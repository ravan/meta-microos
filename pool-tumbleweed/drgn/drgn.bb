SUMMARY = "Scriptable debugger CLI"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python. \
 \
This package contains the CLI program."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "drgn-0.1.0-1.4.aarch64.rpm"
RPM_HASH = "750a0ead10db2da23c361904522ea76343eaf92fceb184b562d837988a27edfcf2e652b26597963bec84d6b521650dfcea7e2dadda6711079b61ff78e4d68cbf"

RPROVIDES:${PN} += "drgn \
python313-drgn-/usr/bin/drgn \
python314-drgn-/usr/bin/drgn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python313-drgn"

inherit rpm
