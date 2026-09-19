SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python314-husl-4.0.3-4.5.noarch.rpm"
RPM_HASH = "293626b155f3e1254fc0708f9ed88d187d41c76e99706cffec43b71e83f1fad8697edc5ca7de00ccc9a62d6dff031627aa62fbe2b526cccb0f79d82744659cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-husl \
python314-husl \
python3dist-husl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
