SUMMARY = "Text input widget for urwid that supports readline shortcuts"
DESCRIPTION = "Urwid-readline is a text input widget that supports readline shortcuts. Needed \
by many apps like pudb."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python314-urwid-readline-0.15.1-1.9.noarch.rpm"
RPM_HASH = "a111f9e988d80b6cf441f6d826d130b18db43d6fb3bf94ea5a5d5c4fefa2f44d5228d4a6b7bd16c1ad0bfed25a8ffd3385af28f69d50acf32e57b993d8efa93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urwid-readline \
python314-urwid-readline \
python3dist-urwid-readline"

RDEPENDS:${PN} += "python-abi \
python314-urwid"

inherit rpm
