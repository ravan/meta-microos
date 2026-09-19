SUMMARY = "Fast python callback/event system modeled after Qt Signals"
DESCRIPTION = "Psygnal (pronounced 'signal') is a pure python implementation of the [observer \
pattern](https://en.wikipedia.org/wiki/Observer_pattern), with the API of \
[Qt-style Signals](https://doc.qt.io/qt-5/signalsandslots.html) with (optional) \
signature and type checking, and support for threading."
LICENSE = "BSD-3-Clause"

PV = "0.15.1"

RPM_NAME = "python314-psygnal-0.15.1-1.1.noarch.rpm"
RPM_HASH = "a46bf33ddd12ddb51c1af257a9814a9e5b5cbe43ab34fbacfdc1f6bc5e885be938dcaf72278f88235fbb19467bfef49edd7bfcd4bf4d35811537c72b1ac59605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-psygnal \
python314-psygnal \
python3dist-psygnal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
