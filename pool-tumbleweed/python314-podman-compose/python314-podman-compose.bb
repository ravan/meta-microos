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

RPM_NAME = "python314-podman-compose-1.6.0-1.1.noarch.rpm"
RPM_HASH = "40856f13c5578a55cc74bbb90010eb5ce04ced295eead0153a16eff694150b8db6a1f391b7122ca96ec2df727c66f83a121c514269f60ee69b4a8e29205dbaf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3.14dist-podman-compose \
python314-podman-compose \
python3dist-podman-compose"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
podman \
python-abi \
python314-PyYAML \
python314-python-dotenv \
python314-setuptools \
update-alternatives"

inherit rpm
