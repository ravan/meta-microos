SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python313-tkreadonly-0.6.1-3.5.noarch.rpm"
RPM_HASH = "dfb5909df6b9830c3b76ffeb29069e702edfd11989bbb3fa436640852ceb223ae6fea8043a9e12044e6617d1b7b4b897d5292ce8205301bee6888b6b8be08787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tkreadonly \
python3.13dist-tkreadonly \
python313-tkreadonly \
python3dist-tkreadonly"

RDEPENDS:${PN} += "python-abi \
python313-Pygments \
python313-idle \
python313-tk"

inherit rpm
