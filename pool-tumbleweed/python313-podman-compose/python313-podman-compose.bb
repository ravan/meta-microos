SUMMARY = "A script to run docker-compose using podman"
DESCRIPTION = "An implementation of `docker-compose` with podman backend. \
The main objective of this project is to be able to run `docker-compose.yml` \
unmodified and rootless.  This project is aimed to provide drop-in replacement \
for `docker-compose`, and it's very useful for certain cases because: \
 \
- can run rootless \
- only depend on `podman` and Python3 and PyYAML \
- no daemon, no setup \
- can be used by developers to run single-machine containerized stacks using \
  single familiar YAML file"
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "python313-podman-compose-1.6.0-1.1.noarch.rpm"
RPM_HASH = "898d6f62db3932f1e28b067ea9f00a83b5ec1d561f27ab109095210e283b2125ac250c34ff2b574e7e35cb0b1109f82c31145eb1a93efab52f18ca7351f5e87e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3-podman-compose \
python3.13dist-podman-compose \
python313-podman-compose \
python3dist-podman-compose"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
podman \
python-abi \
python313-PyYAML \
python313-python-dotenv \
python313-setuptools \
update-alternatives"

inherit rpm
