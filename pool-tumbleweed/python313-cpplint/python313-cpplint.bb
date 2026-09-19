SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python313-cpplint-2.0.2-1.4.noarch.rpm"
RPM_HASH = "d19a6a11822561d62f9bb44b6bba89fae653612e7f2782d9f00f8ea77a6eda46d5ac6a83a62721def2e2a6007ee2c1de46877c89d6da28138803f6aa9f50d523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cpplint \
python3.13dist-cpplint \
python313-cpplint \
python3dist-cpplint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
