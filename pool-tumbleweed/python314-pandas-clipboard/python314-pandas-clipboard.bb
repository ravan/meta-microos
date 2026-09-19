SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-clipboard-3.0.5-2.2.noarch.rpm"
RPM_HASH = "005eb0e7fd9b2f7dcd77587d9fa80697e2602db36e004b822257c2a2b4569323e374cf2af7cc76bd7da998d7ac3d8b681c28a022dd30104666ecca1eb346c294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-clipboard"

RDEPENDS:${PN} += "python314-PyQt5 \
python314-QtPy \
python314-pandas"

inherit rpm
