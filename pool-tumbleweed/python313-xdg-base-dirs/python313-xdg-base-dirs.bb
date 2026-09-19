SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "6.0.2"

RPM_NAME = "python313-xdg-base-dirs-6.0.2-1.7.noarch.rpm"
RPM_HASH = "e5d06e5133f995b2fde594cb0528f99542f1a408d36fbe1c46a2c9528890bdc1d5c0a0d43d6d817dbf1b8333b7b11edebfb1b2c72f89586fcf56644e61e28157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdg \
python3-xdg-base-dirs \
python3.13dist-xdg-base-dirs \
python313-xdg \
python313-xdg-base-dirs \
python3dist-xdg-base-dirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
