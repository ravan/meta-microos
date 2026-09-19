SUMMARY = "Utilities for building and installing packages wuth compiled extensions"
DESCRIPTION = "A package that includes convenience helpers to assist with building Python \
packages with compiled C/Cython extensions. It is developed by the Astropy \
project but is intended to be general and usable by any Python package. \
 \
This is not a traditional package in the sense that it is not intended to be \
installed directly by users or developers. Instead, it is meant to be accessed \
when the setup.py command is run and should be defined as a build-time \
dependency in pyproject.toml files."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python313-extension-helpers-1.4.0-2.5.noarch.rpm"
RPM_HASH = "e02cf06a97237b18e70275bc2106f8296327b09cb401bb71dc19e062b2a573001b285bc6c3484bbaad5b88badf2fa84846a6946c7ba408727d570b7414d8f34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extension-helpers \
python3.13dist-extension-helpers \
python313-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
