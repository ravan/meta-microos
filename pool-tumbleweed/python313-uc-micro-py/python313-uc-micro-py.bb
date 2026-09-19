SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-uc-micro-py-2.0.0-1.3.noarch.rpm"
RPM_HASH = "bc5a2a905a53a966bc352f7f2f5a665fc5b5a81a23840eb9ba5533d142340c5d15b7e457c2887fe0d7f6db81076b6f59116dae57e150f2516db93e247df155a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uc-micro-py \
python3.13dist-uc-micro-py \
python313-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
