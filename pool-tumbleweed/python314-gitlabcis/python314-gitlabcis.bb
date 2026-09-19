SUMMARY = "An automated tool that assesses the GitLab CIS benchmarks against a project"
DESCRIPTION = "An automated tool that assesses the GitLab CIS benchmarks against a project."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "python314-gitlabcis-1.20.1-1.1.noarch.rpm"
RPM_HASH = "373b7f670a7c739150e7e45401db34cfa92237929478afd89540fe61857c4cbb353c90b4db8ba404ed96eb4bf9bd3dc41d28dc56214ac79fff6f551a2198afe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gitlabcis \
python314-gitlabcis \
python3dist-gitlabcis"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-defusedxml \
python314-gql \
python314-python-dateutil \
python314-python-gitlab \
python314-tabulate \
python314-tqdm"

inherit rpm
