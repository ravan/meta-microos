SUMMARY = "RPM macros for building PyQt packages"
DESCRIPTION = "This package provides some macros for using SIP v[456] to build PyQt[56] packages"
LICENSE = "WTFPL"

PV = "0.1"

RPM_NAME = "python-pyqt-rpm-macros-0.1-4.9.noarch.rpm"
RPM_HASH = "a3aaef5f6842190cebae822daac580304e1a630a499134094e7daff152adc0824fda302e81e646f59d2cb25a1ca28024c8842745560bc06de1e9cb636b206afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyqt-rpm-macros \
rpm-macro--pyqt-datadir \
rpm-macro--pyqt-qmake \
rpm-macro-pyqt-build \
rpm-macro-pyqt-install \
rpm-macro-pyqt-install-examples \
rpm-macro-pyqt5-sipdir \
rpm-macro-pyqt6-sipdir \
rpm-macro-sip4-only \
rpm-macro-sip5-only"

RDEPENDS:${PN} += "fdupes \
python-rpm-macros"

inherit rpm
