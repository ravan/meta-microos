SUMMARY = "Wordnet interface library"
DESCRIPTION = "Wn is a Python library for exploring information in wordnets."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-wn-0.13.0-1.4.noarch.rpm"
RPM_HASH = "a609791e8ba96f32ced3b0d1f3aaad9b4be1acf2b9a473ead8514307b914e47369ef71802f88a80a327aa749fbae2ef2ceadfa96a6ee923f86989f0bfbcadaba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wn \
python314-wn \
python3dist-wn"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-tomli"

inherit rpm
