SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.16.0"

RPM_NAME = "python314-makefun-1.16.0-2.5.noarch.rpm"
RPM_HASH = "52f0a1c804728bb27646ae81843898f3cf900c49954dcaca6bcf120b10441681151f5a1009f24e31d6dde41591b0ea175d4035e944d8a29588259f1b8d656c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-makefun \
python314-makefun \
python3dist-makefun"

RDEPENDS:${PN} += "python-abi"

inherit rpm
