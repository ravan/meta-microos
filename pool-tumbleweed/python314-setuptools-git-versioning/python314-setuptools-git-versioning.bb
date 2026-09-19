SUMMARY = "Use git repo data for building a version number according PEP-440"
DESCRIPTION = "Use git repo data (latest tag, current commit hash, etc) for building a \
version number according PEP440. \
 \
  - Can be installed & configured through both `setup.py` and :PEP518's `pyproject.toml` \
  - Does not require to change source code of the project \
  - Tag-, file-, and callback-based versioning schemas are supported \
  - Templates for *tag*, *dev* and *dirty* versions are separated \
  - Templates support a lot of substitutions including git and environment information"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-setuptools-git-versioning-2.1.0-1.7.noarch.rpm"
RPM_HASH = "81d376ea3155bba336a42832499335e62d0f251aa70f87e381aab43fcdd37deec517e053253b0818d4a405784d0bebc90d0e8f42691c5bff17fb409f242ce034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-git-versioning \
python314-setuptools-git-versioning \
python3dist-setuptools-git-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
git-core \
python-abi \
python314-packaging \
python314-setuptools \
update-alternatives"

inherit rpm
