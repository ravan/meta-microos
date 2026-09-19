SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "20.5.0"

RPM_NAME = "python313-irc-20.5.0-2.5.noarch.rpm"
RPM_HASH = "bc229fb9868a54cab407d4ffa9bb34863f6f6bee4c59ce327926e19ed7a6a97860071e3c9ec08df79c6f10fec86e341902f21d72392abcadff9ad868d72da38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-irc \
python3-irclib \
python3.13dist-irc \
python313-irc \
python313-irclib \
python3dist-irc"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.collections \
python313-jaraco.functools \
python313-jaraco.logging \
python313-jaraco.stream \
python313-jaraco.text \
python313-more-itertools \
python313-pytz \
python313-tempora"

inherit rpm
