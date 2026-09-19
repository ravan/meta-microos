SUMMARY = "Package for creating, editing, and reading folder tree diagrams"
DESCRIPTION = "Package for creating, editing, and reading folder tree diagrams."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-seedir-0.5.1-1.2.noarch.rpm"
RPM_HASH = "7684daff516d14ce66a515990d7276d2afe9a047e88fc9b65098a8751fb6b362b553f589d7f58e3f24b3a813e9ea42c0455bfafd3c1532fc5f2be4e703c0cb7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seedir \
python3.13dist-seedir \
python313-seedir \
python3dist-seedir"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-natsort \
update-alternatives"

inherit rpm
