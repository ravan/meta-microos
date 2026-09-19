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

RPM_NAME = "python314-ligotimegps-2.0.1-4.10.noarch.rpm"
RPM_HASH = "331dd7b106ff0760ea4de76eb12d7814160798c9fd2e22d37a91beb05ecd68a8ccaae215b30e21fe1d030afaf7f4e54b24aa8ed1b4af7c5a2c2e0b4ab4661762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ligotimegps \
python314-ligotimegps \
python3dist-ligotimegps"

RDEPENDS:${PN} += "python-abi"

inherit rpm
