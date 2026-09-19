SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python313-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python313-ini2toml-full-0.15-4.2.noarch.rpm"
RPM_HASH = "2bf4eb855ffd644f02f7b00c729581351a5f84b2e9775805020faa22187ce2982b25b6a6b0a7da089346020aeb31c14229b938aa706d28f8481e8b7208dcd70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-full \
python313-ini2toml-full"

RDEPENDS:${PN} += "-python313-configupdater >= 3.0.1 with python313-configupdater < 4 \
-python313-tomlkit >= 0.10 with python313-tomlkit < 2 \
python313-ini2toml"

inherit rpm
