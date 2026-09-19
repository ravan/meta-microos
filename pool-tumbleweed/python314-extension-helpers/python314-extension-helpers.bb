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

RPM_NAME = "python314-extension-helpers-1.4.0-2.5.noarch.rpm"
RPM_HASH = "c3f8e29a4359ebf932e320b7f61489a6ed6bfda4e8bd6bc8b250d87ed9ccae15ded7e8698f722c535827fee0747b71ec6f05c7f33a72fb8141dcdbc7b820b575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-extension-helpers \
python314-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
