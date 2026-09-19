SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "12.4.0"

RPM_NAME = "python313-shinyutils-12.4.0-1.11.noarch.rpm"
RPM_HASH = "ed0d57094073e9766856ec624c164d379ee47bcca343827a1cc30c07b18718f4e0e1b519f1ef7c8d1673f615c3db1ba6d8e76e048c67b0b019c1a5e3688edd7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shinyutils \
python3.13dist-shinyutils \
python313-shinyutils \
python3dist-shinyutils"

RDEPENDS:${PN} += "python-abi \
python313-crayons \
python313-matplotlib \
python313-seaborn"

inherit rpm
