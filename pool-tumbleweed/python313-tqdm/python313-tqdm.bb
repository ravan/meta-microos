SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.70.0"

RPM_NAME = "python313-tqdm-4.70.0-1.1.noarch.rpm"
RPM_HASH = "ff9da162db801e9dd6131ed92078b2444d25ea506d9709444367e6ab7912e51cb6ae57ef6bc6c12d36bceee74c46095cc7aa79192d7ad86300683b589ad656c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tqdm \
python3.13dist-tqdm \
python313-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
