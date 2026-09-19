SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python313-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python313-ini2toml-lite-0.15-4.2.noarch.rpm"
RPM_HASH = "c1fe8c57cd2719a9c60d406adadb1cfa656f10745b9e6c44fb49c38b21d274e5a3362fa6e9011c2c113f420db38ee6270d91669137ce0b08e6197a76c59f80dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-lite \
python313-ini2toml-lite"

RDEPENDS:${PN} += "-python313-tomli-w >= 0.4.0 with python313-tomli-w < 2 \
python313-ini2toml \
python313-tomli"

inherit rpm
