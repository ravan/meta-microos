SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python314-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python314-ini2toml-full-0.15-4.2.noarch.rpm"
RPM_HASH = "7b58cdf262e6de95388e17e650519d99dfe25f60682a471673dd96e290e7fef79056ee84aaac3e08543658bc61743d0b7d2348071a6b134fa536565029204bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-ini2toml-full"

RDEPENDS:${PN} += "-python314-configupdater >= 3.0.1 with python314-configupdater < 4 \
-python314-tomlkit >= 0.10 with python314-tomlkit < 2 \
python314-ini2toml"

inherit rpm
