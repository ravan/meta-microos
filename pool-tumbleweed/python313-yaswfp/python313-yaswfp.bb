SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0-only"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python313-yaswfp-0+git.1411687316.2a2cc6c-2.5.noarch.rpm"
RPM_HASH = "6bd81216dc3800a14df158b45dc57cd81604fade35c53faaceb02ee4e6c0fc1971aacc031bd83b5421861795594aec00052eb02c3a963c97678fc28e1ff3dec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaswfp \
python3.13dist-yaswfp \
python313-yaswfp \
python3dist-yaswfp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
