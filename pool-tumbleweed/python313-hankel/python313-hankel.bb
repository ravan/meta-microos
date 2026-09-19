SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python313-hankel-1.2.2-3.5.noarch.rpm"
RPM_HASH = "08dc0db614cadc07282006443737b8f0544294e0713929df25741d0ca567e94cc4aee743655f224d1c2f58a3f4aa7cf20a1fbd113a69668575579454a2af3243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hankel \
python3.13dist-hankel \
python313-hankel \
python3dist-hankel"

RDEPENDS:${PN} += "python-abi \
python313-mpmath \
python313-numpy \
python313-scipy"

inherit rpm
