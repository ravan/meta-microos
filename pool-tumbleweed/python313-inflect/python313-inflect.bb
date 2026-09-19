SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "7.5.0"

RPM_NAME = "python313-inflect-7.5.0-1.7.noarch.rpm"
RPM_HASH = "75c52a8b088a2eb34351358d30052234e5a2e5fb19e259951fdab254339577e450566d301a9e50acaee060a19d553ec802e1c3094c95b0af0c4f9cca6fd26279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflect \
python3.13dist-inflect \
python313-inflect \
python3dist-inflect"

RDEPENDS:${PN} += "python-abi \
python313-more-itertools \
python313-typeguard"

inherit rpm
