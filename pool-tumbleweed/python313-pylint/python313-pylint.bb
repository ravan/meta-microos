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

RPM_NAME = "python313-pylint-4.0.7-1.1.noarch.rpm"
RPM_HASH = "4d227d1d8a39523024c77aadb1e456fbe81bcaf79e4a5a973ec82d07346e75d4d3913c0b8e7662889b103bfb7e353dd8662d3a858a5cb64a199b2376092da480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint \
python3.13dist-pylint \
python313-pylint \
python3dist-pylint"

RDEPENDS:${PN} += "-python313-astroid >= 4.3.0 with python313-astroid < 4.4.0 \
-python313-isort >= 5 with python313-isort < 9 \
-python313-mccabe >= 0.6 with python313-mccabe < 0.8 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-dill \
python313-platformdirs \
python313-tomlkit"

inherit rpm
