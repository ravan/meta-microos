SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python313-hsluv-5.0.4-1.12.noarch.rpm"
RPM_HASH = "6c28251db03e0ce5b54d425ca6bf72e1e1a3282d82420efdafadf70d8f2c003347c129225d42d7dd69441366d656901ec08c7d8442ec3d99152748714a4493a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hsluv \
python3.13dist-hsluv \
python313-hsluv \
python3dist-hsluv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
