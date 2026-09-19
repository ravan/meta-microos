SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.3.3"

RPM_NAME = "python313-hypothesmith-0.3.3-2.9.noarch.rpm"
RPM_HASH = "95e94510315eb375c3a44f20af7979d1c34362cc08fb14e1c17217e3c97d32cb980b3fb5bc9e26d918a71ceed1b5ebb4711d1c424fdcc5f1fb4f9bd41f3a8cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesmith \
python3.13dist-hypothesmith \
python313-hypothesmith \
python3dist-hypothesmith"

RDEPENDS:${PN} += "python-abi \
python313-base \
python313-hypothesis \
python313-lark \
python313-libcst"

inherit rpm
