SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python313-pybind11-devel-3.0.4-1.3.noarch.rpm"
RPM_HASH = "cbe089a954a24a9b6315d4c8c96b6d5903938870b1d266d8c209cfa3289ee48f94f6b92c4ff266f26f79d1ff432c19e4fe11018b590ba607458147b64172c219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11-devel \
python313-pybind11-devel"

RDEPENDS:${PN} += "python-abi \
python313-devel \
python313-pybind11 \
python313-pybind11-common-devel"

inherit rpm
