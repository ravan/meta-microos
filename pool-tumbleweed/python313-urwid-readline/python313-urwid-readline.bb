SUMMARY = "Text input widget for urwid that supports readline shortcuts"
DESCRIPTION = "Urwid-readline is a text input widget that supports readline shortcuts. Needed \
by many apps like pudb."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python313-urwid-readline-0.15.1-1.9.noarch.rpm"
RPM_HASH = "6336a5f90522afeb6e7dabe22c09bceed62807127316ad148c627de23c7b3b003df3b7f74ad9d3d1c0d28d4acc45808ae926331bb33b61e0dda577056d057b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urwid-readline \
python3.13dist-urwid-readline \
python313-urwid-readline \
python3dist-urwid-readline"

RDEPENDS:${PN} += "python-abi \
python313-urwid"

inherit rpm
