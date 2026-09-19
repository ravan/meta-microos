SUMMARY = "A Python interface to the R Programming Language"
DESCRIPTION = "RPy is a Python interface to the R Programming Language. It can \
manage all kinds of R objects and can execute arbitrary R functions \
(including the graphic functions). All errors from the R language are \
converted to Python exceptions. Any module installed for the R system \
can be used from Python. \
 \
This code is inspired by RSPython from the Omegahat project."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python313-rpy2-3.4.4-2.5.noarch.rpm"
RPM_HASH = "5e53a4802ec4354ac668eefe3a78e06636122b4b1d86d7830490543c591afde61a892ccde546039589406b9db7464a35fb2ecf76931ca8f1829223a8ee5793f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpy2 \
python3.13dist-rpy2 \
python313-rpy2 \
python3dist-rpy2"

RDEPENDS:${PN} += "R-base \
python-abi \
python313-cffi \
python313-numpy \
readline"

inherit rpm
