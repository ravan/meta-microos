SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "10.4.0"

RPM_NAME = "python313-jaraco.packaging-10.4.0-1.2.noarch.rpm"
RPM_HASH = "c8271ee24ba5f097f3ec86d4aee5a533a539174fe3162f3eb3582834fd11c1e0cf04e230bc02fe35ef39b9c579050accce6d0aa6adf20dcf9cac6614b30452e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.packaging \
python3.13dist-jaraco.packaging \
python313-jaraco.packaging \
python3dist-jaraco.packaging"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-build \
python313-domdf-python-tools \
python313-jaraco.context \
python313-virtualenv"

inherit rpm
