SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-clipboard-3.0.5-2.2.noarch.rpm"
RPM_HASH = "aba94ef84b9eda117646c17cd7fc6f549af064acd52d658601369f167780331019831e88b04c83135733f4e3ffa11ba98d3721df50d9204438fc623acd82558a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-clipboard \
python313-pandas-clipboard"

RDEPENDS:${PN} += "python313-PyQt5 \
python313-QtPy \
python313-pandas"

inherit rpm
