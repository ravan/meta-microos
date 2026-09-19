SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "25.2.10"

RPM_NAME = "python314-flatbuffers-25.2.10-2.5.noarch.rpm"
RPM_HASH = "7d2cb0791b51edbb2d26ad9f1295f52e46950b07b6a51f9c2fedf9ab38f285a4fcf38d12413c9c0cc488b55cd0786d5ba2ec2bd1e1593fe35e754e6621e7b10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flatbuffers \
python314-flatbuffers \
python3dist-flatbuffers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
