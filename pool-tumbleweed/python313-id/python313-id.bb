SUMMARY = "A tool for generating OIDC identities"
DESCRIPTION = "id is a Python tool for generating OIDC identities. It can automatically \
detect and produce OIDC credentials on a number of environments, including \
GitHub Actions, GitLab pipelines and Google Cloud."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "python313-id-1.6.1-1.3.noarch.rpm"
RPM_HASH = "722ccce19410b6a9353b1892a19a2ffa8e515ea3c10497e05343865dc3a96562aaa501a5f0559950cdf8ae7036ecdcff915d4e013e7ed414abba6bb374a81d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-id \
python3.13dist-id \
python313-id \
python3dist-id"

RDEPENDS:${PN} += "python-abi \
python313-urllib3"

inherit rpm
