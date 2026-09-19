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

RPM_NAME = "python313-scikit-build-core-1.0.3-1.1.noarch.rpm"
RPM_HASH = "7c946969a7532973ba2f9ff9c57b667ff0461de26af3ca5daa1dc8b84268fb501309209a1999acec8a04595083ffa0d540489cb1a14858ec0caa6f915c47245f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build-core \
python3-scikit-build-core-pyproject \
python3.13dist-scikit-build-core \
python313-scikit-build-core \
python313-scikit-build-core-pyproject \
python3dist-scikit-build-core"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
cmake \
python-abi \
python313-packaging \
python313-pathspec"

inherit rpm
