SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python314-pipreqs-0.5.0-2.2.noarch.rpm"
RPM_HASH = "af345bac8c33e44429d7180a25bc6d07211480a1fdc4f5912ea6c807bba203ca975f9e20dc8dd416af72cea8748b04527d13befc7498a30e4fe7144f3c9d609d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pipreqs \
python314-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-docopt \
python314-ipython \
python314-nbconvert \
python314-yarg"

inherit rpm
