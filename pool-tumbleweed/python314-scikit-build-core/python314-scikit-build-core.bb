SUMMARY = "Build backend for CMake based projects"
DESCRIPTION = "Python CMake adaptor and Python API for plugins \
 \
Features over classic Scikit-build: \
  - Better warnings, errors, and logging \
  - No warning about unused variables \
  - Automatically adds Ninja and/or CMake only as required \
  - No dependency on setuptools, distutils, or wheel in build mode. \
  - Powerful config system, including config options support in build mode. \
  - Automatic inclusion of site-packages in CMAKE_PREFIX_PATH \
  - FindPython is backported if running on CMake < 3.24 (included via hatchling in a submodule, configurable) \
  - Limited API / Stable ABI and pythonless tags supported via config option \
  - No slow generator search, ninja/make or MSVC used by default, respects CMAKE_GENERATOR \
  - SDists are reproducible by default (UNIX, Python 3.9+)"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python314-scikit-build-core-1.0.3-1.1.noarch.rpm"
RPM_HASH = "89686bb0c5706b9c9cd147200a4dddb343337fe7ff867a1c13ccf7192ecf287d52b481e47f2612d62516de130c467d1072e9aa188ee1c8e363aebebdae71e656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scikit-build-core \
python314-scikit-build-core \
python314-scikit-build-core-pyproject \
python3dist-scikit-build-core"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
cmake \
python-abi \
python314-packaging \
python314-pathspec"

inherit rpm
