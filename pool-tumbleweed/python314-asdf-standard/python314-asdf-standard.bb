SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python314-asdf-standard-1.5.0-2.4.noarch.rpm"
RPM_HASH = "70c5bf4347dd9193735de31aa3c2b385b03f1ac323cc95591c2f53d0859c16d784d5ae3a4cc07cbe28c61b1c3318b4a8aa4640970601b65d53412f295925969b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asdf-standard \
python314-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
