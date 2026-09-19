SUMMARY = "Python module for finding dead code"
DESCRIPTION = "Vulture finds unused code in Python programs. This is useful for \
cleaning up and finding errors in code bases. Running Vulture \
on both the library and test suite, untested code can be found. \
 \
Due to Python's dynamic nature, static code analyzers like Vulture are \
likely to miss some dead code. Also, code that is only called implicitly \
may be reported as unused. \
 \
Features: \
 \
* static code analysis \
* only one module \
* tests itself and has complete test coverage \
* complements pyflakes and has the same output syntax \
* sorts unused classes and functions by size with ``--sort-by-size`` \
* supports Python 2.6, 2.7 and 3.x"
LICENSE = "MIT"

PV = "2.16"

RPM_NAME = "python314-vulture-2.16-1.3.noarch.rpm"
RPM_HASH = "4b746ea8244c017e37f19a2d39d62672c905e8fafd6f2595b0cd51b9dc025d491c9f73a4351193a2dbd4233be9a3f6253decc6e50389a406d47a3e3fb94c6b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vulture \
python314-vulture \
python3dist-vulture"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
