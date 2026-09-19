SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python314-dparse-0.6.4-1.10.noarch.rpm"
RPM_HASH = "1cfd720d01f5213d04070a8b6bec87b93d7bd45a13bd2abd46a71bb81c62d2bfd459c57ceb7b09e12f6a2ad69955a5ba9404e307a4982258fb8b15f08635053b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dparse \
python314-dparse \
python3dist-dparse"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-packaging"

inherit rpm
