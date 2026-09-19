SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "4.3.1"

RPM_NAME = "python313-falcon-4.3.1-1.1.noarch.rpm"
RPM_HASH = "419376e65ad2002cef4a0200d54cfe218dc2919aceadd77756b793ccd21c1a8ace90e6aa1cdbe7f46c143e55c8cabe65423013410cbd3abe96a4d7ff9c0ab8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-falcon \
python3.13dist-falcon \
python313-falcon \
python3dist-falcon"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
