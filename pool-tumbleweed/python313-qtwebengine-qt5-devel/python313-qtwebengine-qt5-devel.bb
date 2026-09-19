SUMMARY = "Development files for python313-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python313-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qtwebengine-qt5-devel-5.15.6-6.7.aarch64.rpm"
RPM_HASH = "f59f51b3b18c4b0361bfb4d0e69f7727df827802fc1d1dc28187e216cb47a736ce091ca92ea4465175c2d11ad0203cf2d7c71dbe5ce7407ba44ba3729a98a2d5"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python3-qtwebengine-qt5-api \
python3-qtwebengine-qt5-devel \
python3-qtwebengine-qt5-sip \
python313-qtwebengine-qt5-api \
python313-qtwebengine-qt5-devel \
python313-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python313-qt5-devel"

inherit rpm
