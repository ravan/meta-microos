SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "20.5.0"

RPM_NAME = "python314-irc-20.5.0-2.5.noarch.rpm"
RPM_HASH = "306b79e2d72f9263e57831d0b5e439733811c5263e44aced55d8c938761ee26b54f8a82700f6431c9e8dd71c195fe52500777bc2def12dcf055b8f293ddd582a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-irc \
python314-irc \
python314-irclib \
python3dist-irc"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.collections \
python314-jaraco.functools \
python314-jaraco.logging \
python314-jaraco.stream \
python314-jaraco.text \
python314-more-itertools \
python314-pytz \
python314-tempora"

inherit rpm
