SUMMARY = "Pytest plugin to simplify running shell commands against the system"
DESCRIPTION = "Pytest plugin to simplify running shell commands against the system"
LICENSE = "Apache-2.0"

PV = "1.9.7"

RPM_NAME = "python313-pytest-shell-utilities-1.9.7-3.4.noarch.rpm"
RPM_HASH = "54ef4889abb75c178d784c67c9db794d575f8080a9de3f88dd80b4011ff59e7c785c24077635f86e736803626ded556ef883ab9be74fee297d4a213116c7a295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-shell-utilities \
python3.13dist-pytest-shell-utilities \
python313-pytest-shell-utilities \
python3dist-pytest-shell-utilities"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-psutil \
python313-pytest \
python313-pytest-helpers-namespace \
python313-pytest-skip-markers \
python313-typing-extensions"

inherit rpm
