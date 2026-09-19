SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python313-pipreqs-0.5.0-2.2.noarch.rpm"
RPM_HASH = "9e6131b868b623a42b5401500a3a42346b6d8f04131c31ba4e092f2ef44bb4b0c812330fd6d3d03409ebefb867d1a22a517e90f9d8c0678878bf014fe43444a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipreqs \
python3.13dist-pipreqs \
python313-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-docopt \
python313-ipython \
python313-nbconvert \
python313-yarg"

inherit rpm
