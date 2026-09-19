SUMMARY = "A pure-python version of lalLIGOTimeGPS"
DESCRIPTION = "This module provides a pure-python version of the `LIGOTimeGPS` class, \
used to represent GPS times (number of seconds elapsed since GPS \
epoch) with nanoseconds precision. \
 \
This module is primarily for use as a drop-in replacement for the \
'official' `lal.LIGOTimeGPS` class (provided by the SWIG-python \
bindings of [LAL](//wiki.ligo.org/DASWG/LALSuite)) for use on those \
environments where LAL is not available, or building LAL is \
unnecessary for the application (e.g. testing). \
 \
The code provided here is much slower than the C-implementation \
provided by LAL, so if you really care about performance, don't use \
this module."
LICENSE = "GPL-3.0-only"

PV = "2.0.1"

RPM_NAME = "python313-ligotimegps-2.0.1-4.10.noarch.rpm"
RPM_HASH = "1df5417d5903857763a3f6b9dee69afddfc7ecd1d7024d1cf7092cd859cde94c774d8b80f0941ac53ab99af575e7df67a6f706a7704331bf785cb64af4127579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ligotimegps \
python3.13dist-ligotimegps \
python313-ligotimegps \
python3dist-ligotimegps"

RDEPENDS:${PN} += "python-abi"

inherit rpm
