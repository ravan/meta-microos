SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python314-extratools-0.8.2.1-4.5.noarch.rpm"
RPM_HASH = "e351c4f6f6d3e62ba30ea0a97fe0c66e0e4d4c22ee14b20a9a76f03fb373e98b2416412ec035094bde2b17952ff2cc4bcf57ea499cef7160c371f134604102c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-extratools \
python314-extratools \
python3dist-extratools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-RegexOrder \
python314-TagStats \
python314-sh \
python314-sortedcontainers \
python314-toolz"

inherit rpm
