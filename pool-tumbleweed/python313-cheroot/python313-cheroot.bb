SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "11.1.2"

RPM_NAME = "python313-cheroot-11.1.2-2.1.noarch.rpm"
RPM_HASH = "594eaa57b953a86c9b22f490e3b36ce4293edc8309846cf3cd99ea3d71b52fe62492f6461a48f22e082fcaabbd6270dbdc48fa611a9c9f37c36900788dca2f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cheroot \
python3-cheroot \
python3.13dist-cheroot \
python313-Cheroot \
python313-cheroot \
python3dist-cheroot"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-jaraco.functools \
python313-more-itertools"

inherit rpm
