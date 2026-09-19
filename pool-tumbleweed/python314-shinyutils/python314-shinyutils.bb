SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "12.4.0"

RPM_NAME = "python314-shinyutils-12.4.0-1.11.noarch.rpm"
RPM_HASH = "9bbf2546923412db5f3d1461a1fccaa5c03a5eca7632e0e120993c9200568812bb52dec6f7f4ad32304820ee929636f7788343b805c2d01b6edc179caade9c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shinyutils \
python314-shinyutils \
python3dist-shinyutils"

RDEPENDS:${PN} += "python-abi \
python314-crayons \
python314-matplotlib \
python314-seaborn"

inherit rpm
