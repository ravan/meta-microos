SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-spss-3.0.5-2.2.noarch.rpm"
RPM_HASH = "4f8e1b7039c808104c3ad349aeaec37abee361f3c30f3af2f23379e80f3f013ab5ba1c54682f8d5c91d8f8fe4b379bf8b525ca104bd7a7757d3556a51fc195b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-spss"

RDEPENDS:${PN} += "python314-pandas \
python314-pyreadstat"

inherit rpm
