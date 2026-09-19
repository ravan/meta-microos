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

RPM_NAME = "python313-vulture-2.16-1.3.noarch.rpm"
RPM_HASH = "53c5338f1d5ac62439855e231589ef9c7f36b57cb6fbe0018ffe3cb3e9a61dd01c928304d6e93fa6d38bb6d70304a386c4caa4836ba65d172ba9b1fc1f47f20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vulture \
python3.13dist-vulture \
python313-vulture \
python3dist-vulture"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
