SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python314-cpplint-2.0.2-1.4.noarch.rpm"
RPM_HASH = "fe6aa832ff9bea014337930d728756e58b2ff327924b3818f130f7463d2603fa7158befc0fc6745f4ae68baf991f6f607425d0ca95acd7ce9daef92c22c1762a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cpplint \
python314-cpplint \
python3dist-cpplint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
