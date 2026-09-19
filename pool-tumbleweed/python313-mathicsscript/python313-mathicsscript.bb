SUMMARY = "A command line interface to Mathics"
DESCRIPTION = "Mathicsscript is a feature-rich command line interface to Mathics."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "python313-mathicsscript-10.0.0-1.2.noarch.rpm"
RPM_HASH = "01e9c49f98c5ff8cfb08d9c4c525f9c283610e57904985dc688c8df0c405cf1c564dacd5b3e2acffc7c06b8d26bbb204b3cf75eb74abd0ad2fa7217bc3f6d60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mathicsscript \
python3.13dist-mathicsscript \
python313-mathicsscript \
python3dist-mathicsscript"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Mathics \
python313-Mathics-Scanner \
python313-Pygments \
python313-click \
python313-colorama \
python313-columnize \
python313-mathics-pygments \
python313-networkx \
python313-prompt-toolkit \
python313-term-background \
update-alternatives"

inherit rpm
