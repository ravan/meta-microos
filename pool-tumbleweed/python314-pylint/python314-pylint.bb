SUMMARY = "Syntax and style checker for Python code"
DESCRIPTION = "Pylint analyzes Python source code looking for bugs and signs of poor \
quality. \
 \
Pylint is a python tool that checks if a module satisfies a coding \
standard. Pylint can be seen as another PyChecker since nearly all \
tests you can do with PyChecker can also be done with Pylint. But \
Pylint offers some more features, like checking line-code's length, \
checking if variable names are well-formed according to your coding \
standard, or checking if declared interfaces are truly implemented, and \
much more (see the complete check list). \
 \
The big advantage with Pylint is that it is highly configurable, \
customizable, and you can easily write a small plugin to add a personal \
feature."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.7"

RPM_NAME = "python314-pylint-4.0.7-1.1.noarch.rpm"
RPM_HASH = "bcb2f550b2018123a3e50e960ee135cd536de6a076160c85638bd0127968ea9e2b23eb84de7e568669dd694036988372591d7b596052b7213cdf1e2e0d2a4d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylint \
python314-pylint \
python3dist-pylint"

RDEPENDS:${PN} += "-python314-astroid >= 4.3.0 with python314-astroid < 4.4.0 \
-python314-isort >= 5 with python314-isort < 9 \
-python314-mccabe >= 0.6 with python314-mccabe < 0.8 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-dill \
python314-platformdirs \
python314-tomlkit"

inherit rpm
