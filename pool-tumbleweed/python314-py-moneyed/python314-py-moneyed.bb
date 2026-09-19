SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python314-py-moneyed-3.0-3.7.noarch.rpm"
RPM_HASH = "03a701006255e629cda9bbeb43a67687baea4a52520a89328972b3b12064a64b1129c83056eff6de60ddfb3ae6caa54b3c197fe33c1b70987a884ca72e753a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-moneyed \
python314-py-moneyed \
python3dist-py-moneyed"

RDEPENDS:${PN} += "python-abi \
python314-Babel \
python314-typing-extensions"

inherit rpm
