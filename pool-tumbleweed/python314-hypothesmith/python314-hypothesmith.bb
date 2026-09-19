SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.3.3"

RPM_NAME = "python314-hypothesmith-0.3.3-2.9.noarch.rpm"
RPM_HASH = "28842ed097e6e29696038c1823080e3414ddf2691632c92935f1f88e59c5999017002db6f70c3d4c04bd4a491834d4e46dfd5d605048be4ee9c6c041f7ee03bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hypothesmith \
python314-hypothesmith \
python3dist-hypothesmith"

RDEPENDS:${PN} += "python-abi \
python314-base \
python314-hypothesis \
python314-lark \
python314-libcst"

inherit rpm
