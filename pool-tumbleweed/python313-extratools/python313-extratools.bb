SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python313-extratools-0.8.2.1-4.5.noarch.rpm"
RPM_HASH = "74c5f5a46066bb1b24b3cab920b2cc1e69c5863fc4e627bdb293e0d544bad514da7636e35166406e9aef5e3962ae88e73f1a5d1af3a944012633f87644c5ff46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extratools \
python3.13dist-extratools \
python313-extratools \
python3dist-extratools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-RegexOrder \
python313-TagStats \
python313-sh \
python313-sortedcontainers \
python313-toolz"

inherit rpm
