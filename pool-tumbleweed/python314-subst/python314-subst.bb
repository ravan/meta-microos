SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-subst-0.4.0-4.10.noarch.rpm"
RPM_HASH = "0fda2798f4397b33bbdcb4be00c58c1e400ab78fca7a00aa578d857547cdf6615d34c7aa074fa60b9d78098ddf4344e4f27019222acbf3d84e7596fbf16a229c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-subst \
python314-subst \
python3dist-subst"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
