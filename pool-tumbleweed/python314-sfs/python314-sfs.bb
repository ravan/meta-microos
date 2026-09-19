SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python314-sfs-0.6.3-1.3.noarch.rpm"
RPM_HASH = "5374a302f12635c37fb153005ee4357e753132af7753c1aedf6d2c7faf4eb1c92bfc746ebefa0309819a05596aaecfebe563d3bfa214f5b8e9a6a52ca0841777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sfs \
python314-sfs \
python3dist-sfs"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy"

inherit rpm
