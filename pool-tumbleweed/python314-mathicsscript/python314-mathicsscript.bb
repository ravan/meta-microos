SUMMARY = "A command line interface to Mathics"
DESCRIPTION = "Mathicsscript is a feature-rich command line interface to Mathics."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "python314-mathicsscript-10.0.0-1.2.noarch.rpm"
RPM_HASH = "a4ce9916dc9e14f2ced801a4e9a7be60935d1741f21e1ec02ec99fba6f2ea315295a1ce25c2b6c530857f9d118d45ec3c34ad0c56ea0ca6c60b8610be56e3d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mathicsscript \
python314-mathicsscript \
python3dist-mathicsscript"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Mathics \
python314-Mathics-Scanner \
python314-Pygments \
python314-click \
python314-colorama \
python314-columnize \
python314-mathics-pygments \
python314-networkx \
python314-prompt-toolkit \
python314-term-background \
update-alternatives"

inherit rpm
