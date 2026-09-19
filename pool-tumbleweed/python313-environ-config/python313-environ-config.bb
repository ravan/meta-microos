SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "24.1.0"

RPM_NAME = "python313-environ-config-24.1.0-1.3.noarch.rpm"
RPM_HASH = "7f51c9809a66d8812ce4a0f09b0e00cf8c2e2186c2c2c4f2da530ead067a6b61eb05817854b582f8aa34717ee2a9696621788e14c3bbc981070a2139826b35ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environ-config \
python3.13dist-environ-config \
python313-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python313-attrs"

inherit rpm
