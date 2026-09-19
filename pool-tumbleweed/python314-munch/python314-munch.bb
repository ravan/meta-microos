SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-munch-4.0.0-3.5.noarch.rpm"
RPM_HASH = "599e17b78b0781d4afb5bbac73fa4f76d9ec69c2fb1557f35ab32380545ba90f4ea0dafd3bf453626bc5b7abcdee8c5e99aa37a71128825c039df3549b398fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-munch \
python314-munch \
python3dist-munch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
