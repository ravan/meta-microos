SUMMARY = "Pytest plugin to simplify running shell commands against the system"
DESCRIPTION = "Pytest plugin to simplify running shell commands against the system"
LICENSE = "Apache-2.0"

PV = "1.9.7"

RPM_NAME = "python314-pytest-shell-utilities-1.9.7-3.4.noarch.rpm"
RPM_HASH = "a7d978d44727aef34f3afc048a03c1fd542e31084098b5d142303bd9198c6585b3bf892f62e981c2edb832ce334aced7decd3f2b9e680a470c11dc24fa2e31a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-shell-utilities \
python314-pytest-shell-utilities \
python3dist-pytest-shell-utilities"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-psutil \
python314-pytest \
python314-pytest-helpers-namespace \
python314-pytest-skip-markers \
python314-typing-extensions"

inherit rpm
