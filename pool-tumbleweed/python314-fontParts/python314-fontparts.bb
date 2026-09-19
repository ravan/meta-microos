SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python314-fontParts-0.14.1-1.3.noarch.rpm"
RPM_HASH = "35f3823058e33fe9a0af7f4499f4ccb95cca88c7017fa742b0ea9ec2bd29e9ea6921415a2137839b3bfe9e42e023522ad635c2313d5807b994c5080ed6de8e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fontparts \
python314-fontParts \
python3dist-fontparts"

RDEPENDS:${PN} += "python-abi \
python314-FontTools \
python314-booleanOperations \
python314-defcon \
python314-fontMath \
python314-fs \
python314-lxml"

inherit rpm
