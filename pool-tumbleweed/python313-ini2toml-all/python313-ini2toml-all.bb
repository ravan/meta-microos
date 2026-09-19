SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python313-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python313-ini2toml-all-0.15-4.2.noarch.rpm"
RPM_HASH = "0326a99bfd196428e9e4cb0c962a9794a2ea693fd693566f79f2aa4e7241f092a8166d55e97382a38d68c472c421c115d6b4f9cfe563875bd48a0b7d9853cfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-all \
python313-ini2toml-all"

RDEPENDS:${PN} += "-python313-configupdater >= 3.0.1 with python313-configupdater < 4 \
-python313-tomli-w >= 0.4.0 with python313-tomli-w < 2 \
-python313-tomlkit >= 0.10 with python313-tomlkit < 2 \
python313-ini2toml \
python313-tomli"

inherit rpm
