SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-subst-0.4.0-4.10.noarch.rpm"
RPM_HASH = "f47e634401263d621757991ffe47343c0998c3454458db32d4a58c5b89ad982d1ee8a18eac15ba35b067bbdfd358eaa8913485c96834fa55da2628e6f7273519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subst \
python3.13dist-subst \
python313-subst \
python3dist-subst"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
