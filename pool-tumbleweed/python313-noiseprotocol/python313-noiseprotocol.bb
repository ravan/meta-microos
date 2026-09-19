SUMMARY = "Implementation of Noise Protocol Framework"
DESCRIPTION = "A Python 3 implementation of Noise Protocol Framework. Compatible with revisions 32 and 33."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-noiseprotocol-0.3.1-2.5.noarch.rpm"
RPM_HASH = "4587117b0243779daf92baad4837e0d8a884d12fa46195c5b0836e7ee2655e0f3998fdf6d72f13ec26db88b216042ecd69053838f8753b26f1d0471d7f7a59db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-noiseprotocol \
python3.13dist-noiseprotocol \
python313-noiseprotocol \
python3dist-noiseprotocol"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
