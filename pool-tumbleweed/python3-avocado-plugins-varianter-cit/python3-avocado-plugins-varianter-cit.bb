SUMMARY = "Varianter with Combinatorial Independent Testing capabilities"
DESCRIPTION = "A varianter plugin that generates variants using Combinatorial \
Independent Testing (AKA Pair-Wise) algorithm developed in \
collaboration with CVUT Prague."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-varianter-cit-113.0-1.2.noarch.rpm"
RPM_HASH = "0cdb9c2e84561b809ae77d2a4af5dfb1f59dee5fc9cc459f7a0be91122e73aa11d6138a7a75853b05cc822080cc0b8416e0ffd22642c4a3ffbf71dffe714b73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-cit \
python3.13dist-avocado-framework-plugin-varianter-cit \
python3dist-avocado-framework-plugin-varianter-cit"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
