SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python314-pybind11-devel-3.0.4-1.3.noarch.rpm"
RPM_HASH = "79bfe1641281350cd8d45aa353b42775f10d0eedd0909fdea64fd0ebfd801e401d6a814cf6c8383d6e3cf218afea159c7db7c6e7665a29bc93d785b3ccde98b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pybind11-devel"

RDEPENDS:${PN} += "python-abi \
python314-devel \
python314-pybind11 \
python314-pybind11-common-devel"

inherit rpm
