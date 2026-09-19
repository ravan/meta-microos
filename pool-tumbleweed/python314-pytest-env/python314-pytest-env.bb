SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-pytest-env-1.6.0-1.5.noarch.rpm"
RPM_HASH = "638965b0791b26d4e78efa36a3f90060808f80e7b5a49d8b9a2f483a466c146ef67c4c551c032b3a295ee130dcf52efd15fbc67d716e1e6e5109c6074be29d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-env \
python314-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-python-dotenv"

inherit rpm
