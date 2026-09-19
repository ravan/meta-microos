SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.70.0"

RPM_NAME = "python314-tqdm-4.70.0-1.1.noarch.rpm"
RPM_HASH = "a14a3ee7a46514b302bac485a7dff995611b45b0ef744ec8ec8e05aee9d3343a22d78f4d747f72350816795136dd46b67b9b155b0dbcb71bee3b9eb38b363f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tqdm \
python314-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
