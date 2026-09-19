SUMMARY = "Fast python callback/event system modeled after Qt Signals"
DESCRIPTION = "Psygnal (pronounced 'signal') is a pure python implementation of the [observer \
pattern](https://en.wikipedia.org/wiki/Observer_pattern), with the API of \
[Qt-style Signals](https://doc.qt.io/qt-5/signalsandslots.html) with (optional) \
signature and type checking, and support for threading."
LICENSE = "BSD-3-Clause"

PV = "0.15.1"

RPM_NAME = "python313-psygnal-0.15.1-1.1.noarch.rpm"
RPM_HASH = "0dc83362fcc9d2b02ffbfea768861bd6b2404e0cfd1dc9dab2505b833befaeab050fb6ef4346798fd57b5230ad663067c75df4c478e0f0da9f13d3728dd25e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psygnal \
python3.13dist-psygnal \
python313-psygnal \
python3dist-psygnal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
