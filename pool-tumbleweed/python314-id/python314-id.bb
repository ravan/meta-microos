SUMMARY = "A tool for generating OIDC identities"
DESCRIPTION = "id is a Python tool for generating OIDC identities. It can automatically \
detect and produce OIDC credentials on a number of environments, including \
GitHub Actions, GitLab pipelines and Google Cloud."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "python314-id-1.6.1-1.3.noarch.rpm"
RPM_HASH = "f4abbd6c76c2fa541a5acef9c5bc0ee6e007809196a92f624febaf7ad8a9b9f1f7eaa60c29dd0c28ee8cc7de7bdcc8ef659266ebac2934125416e245516ab5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-id \
python314-id \
python3dist-id"

RDEPENDS:${PN} += "python-abi \
python314-urllib3"

inherit rpm
