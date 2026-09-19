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

RPM_NAME = "python313-setuptools-git-versioning-2.1.0-1.7.noarch.rpm"
RPM_HASH = "b6ac4b40bae5bbd1d286e87edfac1b060aa854f9d17690c35ae2ee889a57087574581fb2bdb4130bf5b18a3e7ad1c203dd20bceacf54b40d935796b3670e750a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git-versioning \
python3.13dist-setuptools-git-versioning \
python313-setuptools-git-versioning \
python3dist-setuptools-git-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
python-abi \
python313-packaging \
python313-setuptools \
update-alternatives"

inherit rpm
