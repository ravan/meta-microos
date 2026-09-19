SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python313-pytest-astropy-header-0.2.2-2.6.noarch.rpm"
RPM_HASH = "b17321d76a222b63798b0d16cc7580660ae4a6f0112e5cb7934e01b08dccd1e6f582049ac5af297838db0c72a36dcbf9726f5fa3b11de6afcafdec0ec25e0c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-astropy-header \
python3.13dist-pytest-astropy-header \
python313-pytest-astropy-header \
python3dist-pytest-astropy-header"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
