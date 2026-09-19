SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python313-sfs-0.6.3-1.3.noarch.rpm"
RPM_HASH = "84b1aa4b57817d8863c54b8823b28bf09c6914bfbc140af45b0bce69ce5a71be0e11d95c2170378dccfea242ce60b46a385124ed3e9d19c02b0d9479521f3b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sfs \
python3.13dist-sfs \
python313-sfs \
python3dist-sfs"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy"

inherit rpm
