SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python313-google_trans_new-1.1.9-3.12.noarch.rpm"
RPM_HASH = "3dd2d359b9ffe9b9091297747f88047144937c44447bbd9fe498ba62f69cae5ae38a7c85fb268979ed247b3a7d14edcefab8a79a258c23978d0c11383766c6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-trans-new \
python3.13dist-google-trans-new \
python313-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-urllib3"

inherit rpm
