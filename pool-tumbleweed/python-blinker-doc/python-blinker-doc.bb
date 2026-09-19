SUMMARY = "Documentation for python-blinker"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender. \
 \
This sub-package contains the HTML documentation."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python-blinker-doc-1.9.0-1.9.noarch.rpm"
RPM_HASH = "100dce80abffddb569098b0a1838d16cb1976569c7f3bd755195ba87871a3b8b288228eace69906b2172582610e2cd30ef077a2cfff14e4eccaacf7bcb4c30ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blinker-doc \
python313-blinker-doc \
python314-blinker-doc"

RDEPENDS:${PN} += ""

inherit rpm
