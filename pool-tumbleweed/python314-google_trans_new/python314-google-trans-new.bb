SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python314-google_trans_new-1.1.9-3.12.noarch.rpm"
RPM_HASH = "c12919d1b8c7904d0c7b6fa5cd42bb78c3098d8709c54831fc96952bf0eef07db97f1ee4a64fdd0e16c4634fe0a98ac7c59bf531289ff12213b4d28284a13e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-trans-new \
python314-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-urllib3"

inherit rpm
