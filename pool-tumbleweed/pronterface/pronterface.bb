SUMMARY = "GUI interface for RepRap"
DESCRIPTION = "Pronterface is a featured G-code sender with graphical user interface. \
It controls the ReRap printer and integrates skeinforge. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0+73"

RPM_NAME = "pronterface-2.2.0+73-1.6.noarch.rpm"
RPM_HASH = "48a84bc5bbc7e33f0ae31e5be5bd0ffe9f6fcab0f688c7bae27aa58a9983c3dcaed82285ccd9821c3468b6d6610486e66fd7971df5df75d6a4f14c3015193870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pronterface"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
pronsole \
python3-platformdirs \
python3-wxPython"

inherit rpm
