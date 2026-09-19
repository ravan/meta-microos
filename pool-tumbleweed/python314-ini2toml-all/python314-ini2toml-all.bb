SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python314-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python314-ini2toml-all-0.15-4.2.noarch.rpm"
RPM_HASH = "ba4cebd3fe7e172d673ffdf11128e49f08f526bc738ddd82c17c376fc8e113cb56b6c5eefc00c45c5beb1ccad2f672b57f433716398fb2251a899d8f2ab15040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-ini2toml-all"

RDEPENDS:${PN} += "-python314-configupdater >= 3.0.1 with python314-configupdater < 4 \
-python314-tomli-w >= 0.4.0 with python314-tomli-w < 2 \
-python314-tomlkit >= 0.10 with python314-tomlkit < 2 \
python314-ini2toml \
python314-tomli"

inherit rpm
