SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-podman-5.8.0-1.3.noarch.rpm"
RPM_HASH = "455eee8fe27f4da92325c2e5c5540475df6b14bbb78809232976ab31ff5f548f04bb98c01cb076bea1c3df26e4e2b1d1d72b355a3ef2f16b388ef176338b02e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-podman \
python314-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-urllib3"

inherit rpm
