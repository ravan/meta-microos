SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-ordered-set-4.1.0-3.12.noarch.rpm"
RPM_HASH = "b639f84a578dae2d23141ee2a9d42a07c8b380b45b52893547b90dafbd8c580cd6bdbe091a65bf28b8397fc88a5ef121333bad8b9c745c098565f6f5c6c01cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ordered-set \
python3.13dist-ordered-set \
python313-ordered-set \
python3dist-ordered-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
