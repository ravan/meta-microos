SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "6.0.2"

RPM_NAME = "python314-xdg-base-dirs-6.0.2-1.7.noarch.rpm"
RPM_HASH = "a67b07536d234f0aaf71e695261cc389583e43b2d3c104211be4542f3075ffe742204f44e22b46def73d70cda270b7166b6deacc90d1f9264fb53b5584a93d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xdg-base-dirs \
python314-xdg \
python314-xdg-base-dirs \
python3dist-xdg-base-dirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
