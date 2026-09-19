SUMMARY = "Software that uses SiriL for preparing acquisition files for processing"
DESCRIPTION = "SiriLic ( SiriL Image Converter) is a software for preparing \
acquisition files (raw, Offset, Flat and Dark) for processing with SiriL software. \
It does three things: \
* Structuring the SiriL working directory into sub-folders \
* Convert Raw, Offset, Dark or Flat files into SiriL sequence \
* Automatically generate the SiriL script according to the files present and the options \
Sirilic allows also to batch process multiple channel and sessions."
LICENSE = "LGPL-3.0-or-later"

PV = "1.15.12"

RPM_NAME = "sirilic-1.15.12-1.6.noarch.rpm"
RPM_HASH = "d6669d655fbace431f375005131b25c2c2aa6c1ef4389f56e932e8a0ffd483dba2e1482019c0a583174559e27bb2cd5fdb078ab058f3780e2dad36e563eba1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-sirilic \
python3dist-sirilic \
sirilic"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-wxPython \
siril"

inherit rpm
