SUMMARY = "An automated tool that assesses the GitLab CIS benchmarks against a project"
DESCRIPTION = "An automated tool that assesses the GitLab CIS benchmarks against a project."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "python313-gitlabcis-1.20.1-1.1.noarch.rpm"
RPM_HASH = "db82fa92177f1946d91c997e962097ec5e07274ec971ad5e429fc256ca6a51b8edb73377a83fbf93f07fc58d86702597e3ccbf8c059e88b95dcd83a669afcc35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gitlabcis \
python3.13dist-gitlabcis \
python313-gitlabcis \
python3dist-gitlabcis"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-defusedxml \
python313-gql \
python313-python-dateutil \
python313-python-gitlab \
python313-tabulate \
python313-tqdm"

inherit rpm
