SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "8.0.4"

RPM_NAME = "python313-python-slugify-8.0.4-3.5.noarch.rpm"
RPM_HASH = "b010f00d23de45dba285db19cbe791feaa2d2734f18b006faeafba040e96a0ab4ad3dac6b6fcbb1031bda5dec45a9893108ce00564b480d5ce78d0f8bd677753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-slugify \
python3.13dist-python-slugify \
python313-python-slugify \
python3dist-python-slugify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-text-unidecode"

inherit rpm
